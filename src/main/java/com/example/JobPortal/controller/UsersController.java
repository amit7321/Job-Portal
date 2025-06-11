/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JobPortal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.JobPortal.entity.Users;
import com.example.JobPortal.entity.UsersType;
import com.example.JobPortal.service.UserService;
import com.example.JobPortal.service.UsersTypeService;

import jakarta.validation.Valid;

/**
 *
 * @author amitg
 */
@Controller
public class UsersController {

    private final UsersTypeService usersTypeService;
    private final UserService usersService;

    public UsersController(UsersTypeService usersTypeService, UserService usersService) {
        this.usersTypeService = usersTypeService;
        this.usersService = usersService;
    }

    @GetMapping("/register")
    public String register(Model model) {
        List<UsersType> usersType = usersTypeService.getAll();
        model.addAttribute("getAllTypes", usersType);
        model.addAttribute("user", new Users());
        return "register";
    }

    @PostMapping("/register/new")
    public String userRegistration(@Valid Users users, Model model) {

        Optional<Users> existingUser = usersService.findByEmail(users.getEmail());
        
        if (existingUser.isPresent()) {
            model.addAttribute("error", "Email already exists. Please use a different email.");
            List<UsersType> usersType = usersTypeService.getAll();
            model.addAttribute("getAllTypes", usersType);
            model.addAttribute("user", new Users());
            return "register";
        }

        usersService.addNewUser(users);
        System.out.println("user ------ " + users);
        return "dashboard";
    }

}
