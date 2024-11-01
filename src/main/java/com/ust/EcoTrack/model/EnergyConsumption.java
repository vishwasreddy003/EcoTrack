package com.ust.EcoTrack.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class EnergyConsumption {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int entry_id;
    private int user_id;
    @JsonFormat(pattern = "MMM")
    private LocalDate month;
    private float electricity_units;
    private int no_of_gas_cylinders;
    private float carbon_emissions;
}
