package com.ust.EcoTrack.Service;

import com.ust.EcoTrack.model.FuelType;
import com.ust.EcoTrack.model.TransportationLog;
import com.ust.EcoTrack.model.TransportationMode;

import java.time.Month;
import java.util.List;
import java.util.Map;

public interface TransportationLogService {
    public TransportationLog addTransportationUsage(TransportationLog transportationLog);

    public List<TransportationLog> getUserTransportationLog(String username);

    public List<TransportationLog> getUserTransportationLogByTransportMode(String username, TransportationMode transportationMode);

    public List<TransportationLog> getUserTransportationLogByFuelType(String username, FuelType fuelType);

    public Map<Month,Float> getTrendsForTransportation(String username);
}
