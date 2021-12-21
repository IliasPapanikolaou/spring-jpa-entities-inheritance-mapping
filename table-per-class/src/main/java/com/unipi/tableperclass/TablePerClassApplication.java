package com.unipi.tableperclass;

import com.unipi.tableperclass.model.FireSpell;
import com.unipi.tableperclass.model.FrostSpell;
import com.unipi.tableperclass.model.Spell;
import com.unipi.tableperclass.repository.FireSpellRepository;
import com.unipi.tableperclass.repository.FrostSpellRepository;
import com.unipi.tableperclass.repository.SpellRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TablePerClassApplication {

    public static void main(String[] args) {
        SpringApplication.run(TablePerClassApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(SpellRepository spellRepository,
                             FireSpellRepository fireSpellRepository,
                             FrostSpellRepository frostSpellRepository) {
        return args -> {

            Spell arcaneSpark = new Spell("Arcane Spark", 50, 60);
            Spell fireBall = new FireSpell("Fireball", 100, 100, 100, 2000);
            Spell meteorShower = new FireSpell("Meteor Shower", 400, 300, 300, 3000);
            Spell frostBolt = new FrostSpell("Frost Bolt", 80, 80, true, 300);

            spellRepository.save(arcaneSpark);
            fireSpellRepository.save(fireBall);
            fireSpellRepository.save(meteorShower);
            frostSpellRepository.save(frostBolt);
        };
    }

}
