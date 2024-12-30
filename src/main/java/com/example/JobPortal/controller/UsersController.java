/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JobPortal.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.JobPortal.entity.Users;
import com.example.JobPortal.entity.UsersType;
import com.example.JobPortal.service.UsersTypeService;

import jakarta.validation.Valid;

/**
 *
 * @author amitg
 */

@Controller
public class UsersController {

    private final UsersTypeService usersTypeService;

    public UsersController(UsersTypeService usersTypeService) {
        this.usersTypeService = usersTypeService;
    }

    @GetMapping("/register")
    public String register(Model model) {
        List<UsersType> usersType = usersTypeService.getAll();
        model.addAttribute("getAllTypes", usersType);
        model.addAttribute("user", new Users());
        return "register";
    }

    @PostMapping("/register/new")
    public String userRegistration(@Valid Users users ) {
        System.out.println("user ------ " + users);
        return "dashboard";
    }


}
