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



//    public Welcome(String name,
//                   String email,
//                   long contact_number,
//                   int room_price,
//                   int total_bill) {
//        this.name = name;
//        this.email = email;
//        this.contact_number = contact_number;
//        this.room_price = room_price;
//        this.total_bill = total_bill;
//    }
}
