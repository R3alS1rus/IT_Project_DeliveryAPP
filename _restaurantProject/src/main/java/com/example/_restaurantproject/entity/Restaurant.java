package com.example._restaurantproject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.core.SpringVersion;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "restaurants")
@NoArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "restaurant_id")
    private UUID restaurantId;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "opening_hours")
    private String openingHours;

    @Column(name = "kitchen_type")
    private String kitchenType;

    @Column(name = "is_open")
    private Boolean isOpen;
}
