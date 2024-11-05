package com.ust.EcoTrack.Service;

import com.ust.EcoTrack.Exceptions.DataAlreadyExistsException;
import com.ust.EcoTrack.Repository.EnergyConsumptionRepository;
import com.ust.EcoTrack.model.EnergyConsumption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@Service
public class EnergyConsumptionServiceImpl implements EnergyConsumptionService{

    @Autowired
    private EnergyConsumptionRepository energyRepo;


    @Override
    public EnergyConsumption saveEnergyConsumption(EnergyConsumption energyConsumption) {
        if(!energyRepo.existsByUserIdAndMonth(energyConsumption.getUser_id(),energyConsumption.getMonth())){
            return energyRepo.save(energyConsumption);
        }else {
            throw new DataAlreadyExistsException("This Month Data already Exists");
        }
    }

    @Override
    public List<EnergyConsumption> getUserTrendsForEnergyConsumption(int userId) {
        Month startMonth = LocalDate.now().minusMonths(10).getMonth();
        return energyRepo.findEnergyConsumptionOfLast10Months(startMonth);
    }
}
