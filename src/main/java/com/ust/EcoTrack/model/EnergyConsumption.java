package com.ust.EcoTrack.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Month;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EnergyConsumption {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int entry_id;
    private int user_id;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Month month;
    private float electricity_units;
    private Float no_of_gas_cylinders;
    private float carbon_emissions;
}
