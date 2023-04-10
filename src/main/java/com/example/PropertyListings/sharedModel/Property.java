package com.example.PropertyListings.sharedModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//shared model, class is also found in Property Search Component-
//-if time allows in feature include shared library dependency instead
@Entity
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String location;
    private double price;
    private double sqrFootage;
    private int bedrooms;
    private int bathrooms;

    // Constructor
    public Property(String location, double price, double sqrFootage, int bedrooms, int bathrooms) {
    }

    // Default Constructor
    public Property() {

    }

    //Getters, and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSqrFootage() {
        return sqrFootage;
    }

    public void setSqrFootage(double size) {
        this.sqrFootage = size;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }
}
