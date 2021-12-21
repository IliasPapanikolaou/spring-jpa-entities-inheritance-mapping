package com.unipi.tableperclass.repository;

import com.unipi.tableperclass.model.Spell;
import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface SpellRepository extends CrudRepository<Spell, Long> {
}
