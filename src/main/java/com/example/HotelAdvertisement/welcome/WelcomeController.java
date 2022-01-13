package com.example.HotelAdvertisement.welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/welcome")
public class WelcomeController {
    @GetMapping
    public List<Welcome> getWelcome(){
        return List.of(
                new Welcome(
                        1,
                        "Joseph",
                        "Joseph@gmail.com",
                        01234567,
                        2500,
                        3500
                )
        );

    }
}
