package com.unipi.tableperclass.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FROST_SPELL")
public class FrostSpell extends Spell {

    private Boolean freezing;
    private Integer freezeDuration;

    public FrostSpell() {
    }

    public FrostSpell(String name, Integer energyCost,
                      Integer damage, Boolean freezing, Integer freezeDuration) {
        super(name, energyCost, damage);
        this.freezing = freezing;
        this.freezeDuration = freezeDuration;
    }
}
