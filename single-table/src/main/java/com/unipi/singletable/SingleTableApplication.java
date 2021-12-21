package com.unipi.singletable;

import com.unipi.singletable.model.*;
import com.unipi.singletable.repository.PaintingRepository;
import com.unipi.singletable.repository.SculptureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SingleTableApplication {

    public static void main(String[] args) {
        SpringApplication.run(SingleTableApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(SculptureRepository sculptureRepository, PaintingRepository paintingRepository) {
        return args -> {
            // Create objects
            ArtPiece sculpture = new Sculpture("John Doe", Material.WOOD, 200.2);
            ArtPiece smallSculpture = new Sculpture("Mick Sculpt", Material.ROCK, 15D);
            ArtPiece painting = new Painting("Tom Smith", PaintingTechnique.OIL, 27.7, 44.9);
            // Save objects to DB
            sculptureRepository.save(sculpture);
            sculptureRepository.save(smallSculpture);
            paintingRepository.save(painting);
            // Delete an object
            sculptureRepository.delete(smallSculpture);
        };
    }
}
