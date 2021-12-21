package com.unipi.mappedsuperclass.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/* @MappedSuperclass:
* We don't have dedicated table in database and all the mapping information
* created inside this class will be applied to each class that inherits
* from it.
*
* Note: We don't use @Entity here
*
* @NoRepositoryBean needed on superclass repository
*/
@MappedSuperclass
public abstract class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer seats;

    // Jpa needs NoArgsConstructor (Default Constructor)
    public Vehicle() {
    }

    public Vehicle(String name, Integer seats) {
        this.name = name;
        this.seats = seats;
    }
}
