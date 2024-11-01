package com.ust.EcoTrack.Service;

import com.ust.EcoTrack.Repository.EnergyConsumptionRepository;
import com.ust.EcoTrack.model.EnergyConsumption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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
            throw new RuntimeException("This Month Data already Exists");
        }
    }

    @Override
    public List<EnergyConsumption> getUserTrendsForEnergyConsumption(int userId) {
        LocalDate startMonth = LocalDate.now().minusMonths(10);
        return energyRepo.findEnergyConsumptionOfLast10Months(startMonth);
    }
}
