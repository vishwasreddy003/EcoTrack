package com.ust.EcoTrack.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TransportationLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int log_id;
    private int user_id;
    @Enumerated(EnumType.STRING)
    private TransportationMode transportation_mode;
    @Enumerated(EnumType.STRING)
    private FuelType fuel_type;
    private float distance_km;
    private Frequency frequency;
    private float carbon_emissions;
}
