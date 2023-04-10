package com.example.PropertyListings.model;

public class PricingDecorator implements PropertyListing {
    private PropertyListing decoratedPropertyListing;

    @Override
    public String getDescription() {
        return decoratedPropertyListing.getDescription() + ", with pricing";
    }
}