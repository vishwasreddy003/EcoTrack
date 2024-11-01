package com.ust.EcoTrack.model;

import jakarta.persistence.*;

@Entity
public class WasteProduction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int waste_id;

    private int user_id;
    @Enumerated(EnumType.STRING)
    private WasteType waste_type;
    private float quantity_kgs;
    private float carbon_emissions;

}
