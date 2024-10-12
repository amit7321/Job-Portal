package com.example.JobPortal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author GUNNER73
 */

@RestController
public class HomeController {

    @GetMapping
    public String home() {
        return "index";
    }

}
