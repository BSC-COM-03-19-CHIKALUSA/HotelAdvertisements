package com.example.HotelAdvertisement;


import com.example.HotelAdvertisement.welcome.Welcome;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class HotelAdvertisementApplication {

	public static void main(String[] args) {

		SpringApplication.run(HotelAdvertisementApplication.class, args);
	}
@GetMapping
    public List<Welcome> hello(){
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
