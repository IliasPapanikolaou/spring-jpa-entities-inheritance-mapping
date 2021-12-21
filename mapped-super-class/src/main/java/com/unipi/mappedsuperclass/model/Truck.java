package com.unipi.mappedsuperclass.model;

import javax.persistence.Entity;
/*
 * Tank table will be created in database
 */
@Entity
public class Truck extends Vehicle {

    private Integer maxLoad;
    private Boolean sleeperCab;

    public Truck() {
    }

    public Truck(String name, Integer seats, Integer maxLoad, Boolean sleeperCab) {
        super(name, seats);
        this.maxLoad = maxLoad;
        this.sleeperCab = sleeperCab;
    }
}
