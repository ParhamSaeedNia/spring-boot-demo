package org.example.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @Value("${profile.name}")
    private String profileName;

    @GetMapping("/profile")
    public String getProfile() {
        return profileName;
    }
}