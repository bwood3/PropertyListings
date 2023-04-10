package com.example.PropertyListings.model;
import com.example.PropertyListings.sharedModel.*;
public class BasicPropertyListing implements PropertyListing {
    private Property property;

    @Override
    public String getDescription() {
        return "Basic property listing";
    }
}

