package com.ust.EcoTrack.Service;

import com.ust.EcoTrack.model.WasteProduction;

import java.util.List;
import java.util.Optional;

public interface WasteProductionService {

     WasteProduction saveWasteProduction(WasteProduction wasteProduction);

     List<WasteProduction> getTrendsForWasteProduction(int user_id);

}
