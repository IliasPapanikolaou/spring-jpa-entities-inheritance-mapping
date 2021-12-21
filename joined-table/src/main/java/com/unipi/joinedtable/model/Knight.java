package com.unipi.joinedtable.model;

import javax.persistence.Entity;

@Entity
public class Knight extends Infantry {

    private Boolean shield;

    public Knight() {
    }

    public Knight(InfantryType infantryType, Integer moveSpeed,
                  Integer durability, Integer attack, Boolean shield) {
        super(infantryType, moveSpeed, durability, attack);
        this.shield = shield;
    }
}
