package com.example.PropertyListings.model;

public class DescriptionDecorator implements PropertyListing {
    private PropertyListing decoratedPropertyListing;

    @Override
    public String getDescription() {
        return decoratedPropertyListing.getDescription() + ", with description";
    }
}