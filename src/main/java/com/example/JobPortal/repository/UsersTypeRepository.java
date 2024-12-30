/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.JobPortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JobPortal.entity.UsersType;

/**
 *
 * @author amitg
 */

@Repository
public interface UsersTypeRepository extends JpaRepository<UsersType, Integer> {

}
