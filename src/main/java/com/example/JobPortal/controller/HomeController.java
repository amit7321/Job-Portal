package com.example.JobPortal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author GUNNER73
 */

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

}
