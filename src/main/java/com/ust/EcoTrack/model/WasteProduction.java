package com.ust.EcoTrack.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Month;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WasteProduction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID waste_id;
    private UUID user_id;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Month month;
    @Enumerated(EnumType.STRING)
    private WasteType waste_type;
    private float quantity_kgs;
    private float carbon_emissions;

}
