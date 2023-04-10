package com.example.PropertyListings.model;

public class PhotoDecorator implements PropertyListing {
    private PropertyListing decoratedPropertyListing;

    @Override
    public String getDescription() {
        return decoratedPropertyListing.getDescription() + ", with photos";
    }
}
