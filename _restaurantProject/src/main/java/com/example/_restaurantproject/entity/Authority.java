package com.example._restaurantproject.entity;


import com.example._restaurantproject.entity.Enumerated.AuthorityType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "authorities")
@NoArgsConstructor
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "authority_id")
    private UUID authorityId;

    @Enumerated(EnumType.STRING)
    @Column(name = "name")
    private AuthorityType name;

    @ManyToMany(mappedBy = "authorities")
    private Set<Role> roles;
}
