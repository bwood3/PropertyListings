package com.example.PropertyListings.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CheckConnection {
    @GetMapping
    //add method to return greetings
    public String greeting()
    {
        return "Connected...";
    }
}