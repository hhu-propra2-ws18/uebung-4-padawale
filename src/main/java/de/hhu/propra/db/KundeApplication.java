package de.hhu.propra.db;

import de.hhu.propra.db.data.KundeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KundeApplication{

    @Autowired
    KundeRepository kunden;

    public static void main(final String[] args) {
        SpringApplication.run(KundeApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        return (String... args) -> {
            System.out.println("Hello, World!");
        };
    }
}
