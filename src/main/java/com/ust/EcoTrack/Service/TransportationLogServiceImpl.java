package com.ust.EcoTrack.Service;

import com.ust.EcoTrack.Repository.TransportationLogRepository;
import com.ust.EcoTrack.model.FuelType;
import com.ust.EcoTrack.model.TransportationLog;
import com.ust.EcoTrack.model.TransportationMode;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TransportationLogServiceImpl implements TransportationLogService{

    @Autowired
    private TransportationLogRepository transportRepo;

    @Override
    public TransportationLog addTransportationUsage(TransportationLog transportationLog) {
        return transportRepo.save(transportationLog);
    }

    @Override
    public List<TransportationLog> getUserTransportationLog(int userId) {
        if(transportRepo.findByUserId(userId) != null || !transportRepo.findByUserId(userId).isEmpty()){
            return transportRepo.findByUserId(userId);
        }else {
            throw new RuntimeException("No Data to show Trends");
        }
    }

    @Override
    public List<TransportationLog> getUserTransportationLogByTransportMode(int userId, TransportationMode transportationMode) {
        if(transportRepo.findByUserIdAndTransportMode(userId,transportationMode) != null || !transportRepo.findByUserIdAndTransportMode(userId,transportationMode).isEmpty()){
            return transportRepo.findByUserIdAndTransportMode(userId,transportationMode);
        }else {
            throw new RuntimeException("No Data to show Trends");
        }
    }

    @Override
    public List<TransportationLog> getUserTransportationLogByFuelType(int userId, FuelType fuelType) {
        if(transportRepo.findByUserIdAndFuelType(userId,fuelType) != null || !transportRepo.findByUserIdAndFuelType(userId,fuelType).isEmpty()){
            return transportRepo.findByUserIdAndFuelType(userId,fuelType);
        }else {
            throw new RuntimeException("No Data to show Trends");
        }
    }
}
