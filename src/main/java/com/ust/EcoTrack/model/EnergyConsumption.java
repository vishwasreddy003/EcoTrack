package com.ust.EcoTrack.model;

import java.time.LocalDate;

public class EnergyConsumption {
    private int entry_id;
    private int user_id;
    private LocalDate month;
    private float electricity_kwh;
    private float gas_therms;
    private float carbon_emissions;
}
