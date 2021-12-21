package com.unipi.joinedtable.model;

import javax.persistence.*;

/*
 * @Inheritance(strategy = InheritanceType.JOINED)
 * Creates 3 tables but the subclasses will not have all the fields as columns,
 * instead they will have only the subclasses fields with Foreign Key the ID
 * of the superclass.
 * We should JOIN the tables to get the full information of the subclass and superclass.
 *
 * @NoRepositoryBean needed on superclass repository
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Infantry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private InfantryType infantryType;
    private Integer moveSpeed;
    private Integer durability;
    private Integer attack;

    public Infantry() {
    }

    public Infantry(InfantryType infantryType, Integer moveSpeed, Integer durability, Integer attack) {
        this.infantryType = infantryType;
        this.moveSpeed = moveSpeed;
        this.durability = durability;
        this.attack = attack;
    }
}
