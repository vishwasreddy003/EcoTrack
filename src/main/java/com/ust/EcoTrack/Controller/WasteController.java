package com.ust.EcoTrack.Controller;

import com.ust.EcoTrack.Service.WasteProductionService;
import com.ust.EcoTrack.model.WasteProduction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/EcoTrack/WasteProduction")
public class WasteController {

    @Autowired
    private WasteProductionService wasteProductionService;

    @PostMapping("/addWasteData")
    public ResponseEntity<WasteProduction> saveWasteData(@RequestBody WasteProduction wasteProduction) {
        WasteProduction savedWaste = wasteProductionService.saveWasteProduction(wasteProduction);
        return new ResponseEntity<>(savedWaste, HttpStatus.CREATED);
    }

    @GetMapping("/analytics/{username}")
    public ResponseEntity<List<WasteProduction>> getAnalyticsForWasteProduction(@PathVariable String username) {
        List<WasteProduction> wasteTrends = wasteProductionService.getTrendsForWasteProduction(username);
        return new ResponseEntity<>(wasteTrends, HttpStatus.OK);
    }
}
