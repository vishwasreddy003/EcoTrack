package com.ust.EcoTrack.service;

import com.ust.EcoTrack.model.WasteProduction;

import java.util.List;

public interface WasteProductionService {

     WasteProduction saveWasteProduction(WasteProduction wasteProduction);

     List<WasteProduction> getTrendsForWasteProduction(String username);

}