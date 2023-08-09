package com.bnta.airline.models;

import jakarta.persistence.*;

@Entity
@Table(name = "passengers")
public class flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int number;
}
