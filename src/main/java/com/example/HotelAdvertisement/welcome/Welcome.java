package com.example.HotelAdvertisement.welcome;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import lombok.Setter;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table
public class Welcome {
    @Id
    @SequenceGenerator(
            name="welcome_sequence",
            sequenceName = "welcome_sequence",
            allocationSize = 1

    )
    @GeneratedValue(strategy= GenerationType.AUTO,
    generator = "welcome_sequence")

    private int id;
    private String name;
    private String email;
    private long contact_number;
    private int room_price;
    private int total_bill;

    public Welcome(String name, String email, long contact_number, int room_price, int total_bill) {
        this.name = name;
        this.email = email;
        this.contact_number = contact_number;
        this.room_price = room_price;
        this.total_bill = total_bill;
    }
}
