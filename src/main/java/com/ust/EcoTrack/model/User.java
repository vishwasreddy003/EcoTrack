package com.ust.EcoTrack.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EcoUser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;
    private String userName;
    private String email;
    @Size(min = 8,message = "Password should be atleast 8 characters")
    private String password;
    private int age;
    private float green_score;
    @Enumerated(EnumType.STRING)
    private Frequency reminderFrequency;

}
