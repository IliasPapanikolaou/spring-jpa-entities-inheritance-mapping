package com.unipi.singletable.model;

import javax.persistence.*;

/*
 * @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
 * All entities will be stored in the same table
 * We will need an extra column to distinguish the type of the object:
 * @DiscriminatorColumn will have value of Painting or Sculpture:
 *
 * SubClasses also need the annotation @DiscriminatorValue(value = "...")
 *
 * @NoRepositoryBean needed on superclass repository
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "ART_PIECE_TYPE", discriminatorType = DiscriminatorType.STRING)
public class ArtPiece {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String author;

    public ArtPiece() {
    }

    public ArtPiece(String author) {
        this.author = author;
    }
}
