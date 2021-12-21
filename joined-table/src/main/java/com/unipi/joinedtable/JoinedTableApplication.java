package com.unipi.joinedtable;

import com.unipi.joinedtable.model.Archer;
import com.unipi.joinedtable.model.Infantry;
import com.unipi.joinedtable.model.InfantryType;
import com.unipi.joinedtable.model.Knight;
import com.unipi.joinedtable.repository.ArcherRepository;
import com.unipi.joinedtable.repository.InfantryRepository;
import com.unipi.joinedtable.repository.KnightRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JoinedTableApplication {

    public static void main(String[] args) {
        // ConfigurableApplicationContext configurableApplicationContext =
        SpringApplication.run(JoinedTableApplication.class, args);
        // Instead of CommandLineRunner
        // InfantryRepository archerRepository = configurableApplicationContext.getBean(ArcherRepository.class);
        // InfantryRepository knightRepository = configurableApplicationContext.getBean(KnightRepository.class);
    }

    @Bean
    CommandLineRunner runner(ArcherRepository archerRepository, KnightRepository knightRepository) {
        return args -> {
            // Create objects
            Infantry archer = new Archer(InfantryType.LIGHT, 300, 500, 100, 1000);
            Infantry knight = new Knight(InfantryType.HEAVY, 280, 1000, 300, true);
            // Save objects to DB
            archerRepository.save(archer);
            knightRepository.save(knight);
        };
    }

}
