package com.unipi.mappedsuperclass.model;

import javax.persistence.Entity;
/*
 * Tank table will be created in database
 */
@Entity
public class Tank extends Vehicle {

    private Integer firePower;

    // NoArgsConstructor
    public Tank() {
    }

    // AllArgsConstructor
    public Tank(String name, Integer seats, Integer firePower) {
        super(name, seats);
        this.firePower = firePower;
    }
}
