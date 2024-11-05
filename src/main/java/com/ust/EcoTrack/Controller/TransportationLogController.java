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
import java.util.UUID;

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

    @GetMapping("/{username}")
    public ResponseEntity<List<TransportationLog>> getAnalyticsOfTransportation(@PathVariable String username) {
        List<TransportationLog> logs = transportationLogService.getUserTransportationLog(username);
        return new ResponseEntity<>(logs, HttpStatus.OK);
    }

    @GetMapping("/type/{username}/{mode}")
    public ResponseEntity<List<TransportationLog>> getAnalyticsOfTransportationByMode(@PathVariable String username, @PathVariable TransportationMode mode) {
        List<TransportationLog> logsByMode = transportationLogService.getUserTransportationLogByTransportMode(username, mode);
        return new ResponseEntity<>(logsByMode, HttpStatus.OK);
    }

    @GetMapping("/mode/{userId}/{type}")
    public ResponseEntity<List<TransportationLog>> getAnalyticsOfTransportationByType(@PathVariable String username, @PathVariable FuelType type) {
        List<TransportationLog> logsByType = transportationLogService.getUserTransportationLogByFuelType(username, type);
        return new ResponseEntity<>(logsByType, HttpStatus.OK);
    }
}
