package com.example.HotelAdvertisement.welcome;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WelcomeService {
    public List<Welcome> getWelcome() {
        return List.of(
                new Welcome(
                        "Joseph",
                        "Joseph@gmail.com",
                        01234567,
                        2500,
                        3500

                )
        );
    }
}
