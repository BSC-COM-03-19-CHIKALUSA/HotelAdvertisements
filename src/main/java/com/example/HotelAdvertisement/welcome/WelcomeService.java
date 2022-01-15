package com.example.HotelAdvertisement.welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
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
           throw new IllegalStateException("Email already found");

       }
        welcomeRepository.save(welcome);
    }

    public void deleteWelcome(int customerId) {
        boolean exists = welcomeRepository.existsById(customerId);
        if (!exists){
            throw new IllegalStateException(
                    "Customer with Id "+ customerId + "does not exists");
        }
        welcomeRepository.deleteById(customerId);
    }
@Transactional
    public void updateWelcome(int customerId,
                              String name,
                              String email) {

        Welcome welcome = welcomeRepository.findById(customerId)
                .orElseThrow(() -> new IllegalStateException(
                  "customer with Id " + customerId + "does not exists"
        ));
        if (name!=null &&
        name.length() > 0 &&
        !Objects.equals(welcome.getName(),name)){
            welcome.setName(name);
        }


            if (email!=null &&
                    email.length()>0 &&
                    !Objects.equals(welcome.getEmail(),email)){
                Optional<Welcome> welcomeOptional=welcomeRepository
                        .findWelcomeByEmail(email);
                        if(welcomeOptional.isPresent()){
                            throw new IllegalStateException("Email already found");
                        }
                        welcome.setEmail(email);
            }
    }
}

