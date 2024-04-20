package com.example._restaurantproject.entity;


import com.example._restaurantproject.entity.Enumerated.ProductType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "products")
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "product_id")
    private UUID productId;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private  Double price;

    @Column(name = "product_type")
    private ProductType productType;

    @Column(name = "is_available")
    private Boolean isAvailable;

}
