package com.ust.EcoTrack.Service;

import com.ust.EcoTrack.Exceptions.DataAlreadyExistsException;
import com.ust.EcoTrack.Repository.WasteProductionRepository;
import com.ust.EcoTrack.model.WasteProduction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class WasteProductionServiceImpl implements WasteProductionService{

    @Autowired
    private WasteProductionRepository wasteProductionRepository;

    @Override
    public WasteProduction saveWasteProduction(WasteProduction wasteProduction) {
        if(!wasteProductionRepository.existsById(wasteProduction.getWaste_id())){
            return wasteProductionRepository.save(wasteProduction);
        }
        else{
            throw new DataAlreadyExistsException("Data Already exists");
        }
    }

    @Override
    public List<WasteProduction> getTrendsForWasteProduction(int user_id) {
        Month startDate = LocalDate.now().minusMonths(10).getMonth();
        return wasteProductionRepository.findWasteProductionFromLastTenMonths(startDate);
    }
}
