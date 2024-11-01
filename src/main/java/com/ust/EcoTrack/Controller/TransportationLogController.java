package com.ust.EcoTrack.Controller;


import com.ust.EcoTrack.Service.TransportationLogService;
import com.ust.EcoTrack.model.FuelType;
import com.ust.EcoTrack.model.TransportationLog;
import com.ust.EcoTrack.model.TransportationMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/EcoTrack/transportation")
public class TransportationLogController {

    @Autowired
    private TransportationLogService transportationLogService;

    @PostMapping
    public TransportationLog saveTransportationLog(@RequestBody  TransportationLog transportationLog){
        return transportationLogService.addTransportationUsage(transportationLog);
    }

    @GetMapping("/${userId}")
    public List<TransportationLog> getAnalyticsOfTransportation(@PathVariable int userId){
        return transportationLogService.getUserTransportationLog(userId);
    }


    @GetMapping("/${userId}/${mode}")
    public List<TransportationLog> getAnalyticsOfTransportationByMode(@PathVariable int userId, @PathVariable String mode){
        return transportationLogService.getUserTransportationLogByTransportMode(userId,mode);
    }

    @GetMapping("/${userId}/${type}")
    public List<TransportationLog> getAnalyticsOfTransportationByType(@PathVariable int userId, @PathVariable String type){
        return transportationLogService.getUserTransportationLogByFuelType(userId,type);
    }
}
