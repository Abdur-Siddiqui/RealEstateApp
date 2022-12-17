package com.example.realestateapp.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Property {
    @Id @GeneratedValue
    private long listingId;
    @Column(name = "num_Beds")
    private int numOfBeds;
    @Column( name ="num_Baths")
    private int numOfBaths;
    @Column(name ="sqrt_Foot")
    private double sqrtFoot;

    @Column(name ="price")
    private double price;

    @Column(name ="property_Type")
    private String propertyType;
    @Column(name ="image")
    private byte image;
    @Column(name ="city")
    private String city;


}
