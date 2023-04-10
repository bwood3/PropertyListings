package com.example.PropertyListings.controller;

import com.example.PropertyListings.model.PropertyListing;
import com.example.PropertyListings.sharedModel.Property;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/property_listings")
public class PropertyListingController {

    private PropertyListing propertyListingService;

    @GetMapping
    public List<Property> getAllPropertyListings() {
        return null;
    }

    @GetMapping("/{propertyId}")
    public Property getPropertyListingById(@PathVariable Long propertyId) {
        return null;
    }

    @PostMapping
    public Property createPropertyListing(@RequestBody Property property) {
        return null;
    }

    @PutMapping("/{propertyId}")
    public Property updatePropertyListing(@PathVariable Long propertyId, @RequestBody Property updatedProperty) {
        return null;
    }

    @DeleteMapping("/{propertyId}")
    public void deletePropertyListing(@PathVariable Long propertyId) {
    }
}
