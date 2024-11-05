package com.ust.EcoTrack.Controller;

import com.ust.EcoTrack.Service.TransportationLogService;
import com.ust.EcoTrack.model.FuelType;
import com.ust.EcoTrack.model.TransportationLog;
import com.ust.EcoTrack.model.TransportationMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/EcoTrack/transportation")
public class TransportationLogController {

    @Autowired
    private TransportationLogService transportationLogService;

    @PostMapping
    public ResponseEntity<TransportationLog> saveTransportationLog(@RequestBody TransportationLog transportationLog) {
        TransportationLog savedLog = transportationLogService.addTransportationUsage(transportationLog);
        return new ResponseEntity<>(savedLog, HttpStatus.CREATED);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<TransportationLog>> getAnalyticsOfTransportation(@PathVariable int userId) {
        List<TransportationLog> logs = transportationLogService.getUserTransportationLog(userId);
        return new ResponseEntity<>(logs, HttpStatus.OK);
    }

    @GetMapping("/type/{userId}/{mode}")
    public ResponseEntity<List<TransportationLog>> getAnalyticsOfTransportationByMode(@PathVariable int userId, @PathVariable TransportationMode mode) {
        List<TransportationLog> logsByMode = transportationLogService.getUserTransportationLogByTransportMode(userId, mode);
        return new ResponseEntity<>(logsByMode, HttpStatus.OK);
    }

    @GetMapping("/mode/{userId}/{type}")
    public ResponseEntity<List<TransportationLog>> getAnalyticsOfTransportationByType(@PathVariable int userId, @PathVariable FuelType type) {
        List<TransportationLog> logsByType = transportationLogService.getUserTransportationLogByFuelType(userId, type);
        return new ResponseEntity<>(logsByType, HttpStatus.OK);
    }
}
