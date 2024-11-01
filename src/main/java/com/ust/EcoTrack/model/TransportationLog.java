package com.ust.EcoTrack.model;

import jakarta.persistence.*;

@Entity
public class TransportationLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int log_id;
    private int user_id;
    @Enumerated(EnumType.STRING)
    private TransportationMode transportation_mode;
    @Enumerated(EnumType.STRING)
    private FuelType fuelType;
    private float distance_km;
    private Frequency frequency;
    private float carbon_emissions;
}
