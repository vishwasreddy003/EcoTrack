package com.ust.EcoTrack.Controller;

import com.ust.EcoTrack.Service.WasteProductionService;
import com.ust.EcoTrack.model.WasteProduction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/EcoTrack/WasteProduction")
public class WasteController {

    @Autowired
    private WasteProductionService wasteProductionService;

    @PostMapping
    public WasteProduction saveWasteData(@RequestBody WasteProduction wasteProduction){
        return wasteProductionService.saveWasteProduction(wasteProduction);
    }

    @GetMapping("/analytics/{userId}")
    public List<WasteProduction> getAnalyticsForWasteProduction(@PathVariable int userId){
        return wasteProductionService.getTrendsForWasteProduction(userId);
    }


}
