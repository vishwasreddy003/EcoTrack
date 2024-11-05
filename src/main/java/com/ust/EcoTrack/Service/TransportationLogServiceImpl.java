package com.ust.EcoTrack.Service;

import com.ust.EcoTrack.Exceptions.DataNotFoundException;
import com.ust.EcoTrack.Repository.TransportationLogRepository;
import com.ust.EcoTrack.Repository.UserRepository;
import com.ust.EcoTrack.model.FuelType;
import com.ust.EcoTrack.model.TransportationLog;
import com.ust.EcoTrack.model.TransportationMode;
import com.ust.EcoTrack.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class TransportationLogServiceImpl implements TransportationLogService{

    @Autowired
    private TransportationLogRepository transportRepo;

    @Autowired
    private UserRepository userRepo;

    @Override
    public TransportationLog addTransportationUsage(TransportationLog transportationLog) {
        return transportRepo.save(transportationLog);
    }

    @Override
    public List<TransportationLog> getUserTransportationLog(String username) {
        User user = userRepo.findByUserName(username);
        UUID userId = user.getUser_id();
        if(transportRepo.findByUserId(userId) != null || !transportRepo.findByUserId(userId).isEmpty()){
            return transportRepo.findByUserId(userId);
        }else {
            throw new DataNotFoundException("No Data to show Trends");
        }
    }

    @Override
    public List<TransportationLog> getUserTransportationLogByTransportMode(String username, TransportationMode transportationMode) {
        User user = userRepo.findByUserName(username);
        UUID userId = user.getUser_id();

        if(transportRepo.findByUserIdAndTransportMode(userId,transportationMode) != null || !transportRepo.findByUserIdAndTransportMode(userId,transportationMode).isEmpty()){
            return transportRepo.findByUserIdAndTransportMode(userId,transportationMode);
        }else {
            throw new DataNotFoundException("No Data to show Trends");
        }
    }

    @Override
    public List<TransportationLog> getUserTransportationLogByFuelType(String username, FuelType fuelType) {
        User user = userRepo.findByUserName(username);
        UUID userId = user.getUser_id();

        if(transportRepo.findByUserIdAndFuelType(userId,fuelType) != null || !transportRepo.findByUserIdAndFuelType(userId,fuelType).isEmpty()){
            return transportRepo.findByUserIdAndFuelType(userId,fuelType);
        }else {
            throw new DataNotFoundException("No Data to show Trends");
        }
    }
}
