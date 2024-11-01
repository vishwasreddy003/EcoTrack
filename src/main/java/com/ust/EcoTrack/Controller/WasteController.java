package com.ust.EcoTrack.Controller;

import com.ust.EcoTrack.Service.WasteProductionService;
import com.ust.EcoTrack.model.WasteProduction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/EcoTrack/WasteProduction")
public class WasteController {

    @Autowired
    private WasteProductionService wasteProductionService;

    @PostMapping
    public WasteProduction saveWasteData(WasteProduction wasteProduction){
        return wasteProductionService.saveWasteProduction(wasteProduction);
    }

    @GetMapping("/analytics")
    public List<WasteProduction> getAnalyticsForWasteProduction(int userId){
        return wasteProductionService.getTrendsForWasteProduction(userId);
    }


}
