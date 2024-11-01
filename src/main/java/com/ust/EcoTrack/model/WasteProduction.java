package com.ust.EcoTrack.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WasteProduction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int waste_id;
    private int user_id;
    @JsonFormat(pattern = "MMM")
    private LocalDate month;
    @Enumerated(EnumType.STRING)
    private WasteType waste_type;
    private float quantity_kgs;
    private float carbon_emissions;

}
