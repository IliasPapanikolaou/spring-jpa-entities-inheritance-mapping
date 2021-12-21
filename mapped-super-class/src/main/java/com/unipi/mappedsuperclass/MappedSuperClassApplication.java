package com.unipi.mappedsuperclass;

import com.unipi.mappedsuperclass.model.Tank;
import com.unipi.mappedsuperclass.model.Truck;
import com.unipi.mappedsuperclass.repository.TankRepository;
import com.unipi.mappedsuperclass.repository.TruckRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MappedSuperClassApplication {

    public static void main(String[] args) {
        SpringApplication.run(MappedSuperClassApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(TankRepository tankRepository, TruckRepository truckRepository) {
        return args -> {
            // Create objects
            Tank tank1 = new Tank("T-150", 5, 500);
            Tank tank2 = new Tank("Leopard", 4, 800);
            Truck truck = new Truck("200M", 2, 36, true);

            // Test save to DB
            tankRepository.save(tank1);
            tankRepository.save(tank2);

            truckRepository.save(truck);

            // Test delete from DB
            tankRepository.delete(tank2);
        };
    }

}
