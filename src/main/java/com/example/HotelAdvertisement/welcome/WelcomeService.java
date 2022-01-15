package com.example.HotelAdvertisement.welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WelcomeService {

    private final WelcomeRepository welcomeRepository;

    @Autowired
    public WelcomeService(WelcomeRepository welcomeRepository) {

        this.welcomeRepository = welcomeRepository;
    }

    public List<Welcome> getWelcome() {

        return welcomeRepository.findAll();


    }

    public void addNewWelcome(Welcome welcome) {
       Optional<Welcome> welcomeOptional=welcomeRepository
               .findWelcomeByEmail(welcome.getEmail());
       if (welcomeOptional.isPresent()) {
           throw new IllegalStateException("Email found");

       }
        welcomeRepository.save(welcome);
    }
}

