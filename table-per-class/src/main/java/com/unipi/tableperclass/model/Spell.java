package com.unipi.tableperclass.model;

import javax.persistence.*;

/*
 * @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS):
 * Very Similar to mapped-super-class approach, the difference is that
 * we will have the table for Spell entity. In the mapped-super-class
 * we don't create superclass table.
 *
 * If we mark this class as abstract, the Jpa will not create the table,
 * but we don't want this for this particular strategy.
 *
 * We also have to mark SpellRepository as @Primary
 */

@Entity
@Table(name = "SPELL")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Spell {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer energyCost;
    private Integer damage;

    public Spell() {
    }

    public Spell(String name, Integer energyCost, Integer damage) {
        this.name = name;
        this.energyCost = energyCost;
        this.damage = damage;
    }
}
