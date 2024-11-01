package com.ust.EcoTrack.Service;

import com.ust.EcoTrack.model.FuelType;
import com.ust.EcoTrack.model.TransportationLog;
import com.ust.EcoTrack.model.TransportationMode;

import java.util.List;

public interface TransportationLogService {
    public TransportationLog addTransportationUsage(TransportationLog transportationLog);

    public List<TransportationLog> getUserTransportationLog(int useId);

    public List<TransportationLog> getUserTransportationLogByTransportMode(int useId, String transportationMode);

    public List<TransportationLog> getUserTransportationLogByFuelType(int userId, String fuelType);

}
