package com.example.HotelAdvertisement.welcome;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class WelcomeConfig{
    @Bean
    CommandLineRunner commandLineRunner(
            WelcomeRepository repository) {

      return args -> {
            Welcome  Joseph   =new Welcome(
                 "Joseph",
                "Joseph@gmail.com",
                 34567890,
                 2500,
                 3500
                 );
          Welcome  Maria   =new Welcome(
                  "Maria",
                  "Maria@gmail.com",
                  12345678,
                  3500,
                  4500
          );
          Welcome  Jessy   =new Welcome(
                  "Jessy",
                  "Jessy@gmail.com",
                  23456789,
                  5500,
                  6500
          );
          repository.saveAll(
                  List.of(Joseph,Maria,Jessy)
          );
        };
     }
}
