package com.unipi.joinedtable.repository;

import com.unipi.joinedtable.model.Infantry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface InfantryRepository extends JpaRepository<Infantry, Long> {
}
