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
    @DeleteMapping(path="{customerId}")
    public void deleteWelcome(@PathVariable("customerId")int customerId){
    welcomeService.deleteWelcome(customerId);
    }
@PutMapping(path = "{customerId}")
    public void updateWelcome(
            @PathVariable("customerId") int customerId,
            @RequestParam(required = false)String name,
            @RequestParam(required = false)String email){
    welcomeService.updateWelcome(customerId,name,email);
    }

}
