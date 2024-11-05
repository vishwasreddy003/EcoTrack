package com.ust.EcoTrack.Service;

import com.ust.EcoTrack.Exceptions.DataAlreadyExistsException;
import com.ust.EcoTrack.Repository.EnergyConsumptionRepository;
import com.ust.EcoTrack.Repository.UserRepository;
import com.ust.EcoTrack.model.EnergyConsumption;
import com.ust.EcoTrack.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.UUID;


@Service
public class EnergyConsumptionServiceImpl implements EnergyConsumptionService{

    @Autowired
    private EnergyConsumptionRepository energyRepo;

    @Autowired
    private UserRepository userRepo;


    @Override
    public EnergyConsumption saveEnergyConsumption(EnergyConsumption energyConsumption) {
        UUID userId = energyConsumption.getUser_id();

        if(!energyRepo.existsByUserIdAndMonth(userId,energyConsumption.getMonth())){
            return energyRepo.save(energyConsumption);
        }else {
            throw new DataAlreadyExistsException("This Month Data already Exists");
        }
    }

    @Override
    public List<EnergyConsumption> getUserTrendsForEnergyConsumption(String username) {
        User user = userRepo.findByUserName(username);
        Month startMonth = LocalDate.now().minusMonths(10).getMonth();
        return energyRepo.findEnergyConsumptionOfLast10Months(user.getUser_id(),startMonth);
    }
}
