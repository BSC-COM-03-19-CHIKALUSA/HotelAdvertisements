package com.example.HotelAdvertisement.welcome;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
//@Entity
//@Table(name="student")
public class Welcome {
//    @Id
//      @GeneratedValue(strategy= GenerationType.AUTO)

    private int id;
    private String name;
    private String email;
    private long contact_number;
    private int room_price;
    private int total_bill;
}
