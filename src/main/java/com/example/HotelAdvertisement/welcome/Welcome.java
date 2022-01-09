package com.example.HotelAdvertisement.welcome;

public class Welcome {
    private int id;
    private String name;
    private String email;
    private long contact_number;
    private int room_price;
    private int total_bill;

    public Welcome() {
    }

    public Welcome(String name,
                   String email,
                   long contact_number,
                   int room_price,
                   int total_bill) {
        this.name = name;
        this.email = email;
        this.contact_number = contact_number;
        this.room_price = room_price;
        this.total_bill = total_bill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContact_number() {
        return contact_number;
    }

    public void setContact_number(long contact_number) {
        this.contact_number = contact_number;
    }

    public int getRoom_price() {
        return room_price;
    }

    public void setRoom_price(int room_price) {
        this.room_price = room_price;
    }

    public int getTotal_bill() {
        return total_bill;
    }

    public void setTotal_bill(int total_bill) {
        this.total_bill = total_bill;
    }

    @Override
    public String toString() {
        return "Welcome{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contact_number=" + contact_number +
                ", room_price=" + room_price +
                ", total_bill=" + total_bill +
                '}';
    }
}
