package com.unipi.singletable.repository;

import com.unipi.singletable.model.ArtPiece;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/*
 * @NoRepositoryBean: This repository will be excluded by Spring,
 * and it will not be possible to create an instance of this repository
 * The reason we create this repository is to extend 'CrudRepository'.
 */
@NoRepositoryBean
public interface ArtPieceRepository extends CrudRepository<ArtPiece, Long> {
}
