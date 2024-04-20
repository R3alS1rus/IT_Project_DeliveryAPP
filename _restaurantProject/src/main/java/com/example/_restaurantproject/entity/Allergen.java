package com.example._restaurantproject.entity;

import com.example._restaurantproject.entity.Enumerated.AllergenType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "allergens")
@NoArgsConstructor
public class Allergen {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "allergen_id")
    private UUID allergenId;

    @Column(name = "name")
    private AllergenType name;
}
