package com.example.HotelAdvertisement.welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/welcome")
public class WelcomeController{
    public final WelcomeService welcomeService;
@Autowired
    public WelcomeController(WelcomeService welcomeService) {

    this.welcomeService = welcomeService;
    }
    @GetMapping
    public List<Welcome> getWelcome(){
        return welcomeService.getWelcome();

    }
    @PostMapping
    public void theNewWelcome(@RequestBody Welcome welcome){
       welcomeService.addNewWelcome(welcome);
    }

}
