/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.JobPortal.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

/**
 *
 * @author amitg
 */

@Entity
public class UsersType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String userTypeName;

    @OneToMany(targetEntity = Users.class, mappedBy = "usersTypeId", cascade = CascadeType.ALL)
    private List<Users> users;

    public UsersType() {
    }

    public UsersType(int id, String userTypeName, List<Users> users) {
        this.id = id;
        this.userTypeName = userTypeName;
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UsersType{");
        sb.append("id=").append(id);
        sb.append(", userTypeName=").append(userTypeName);
        sb.append(", users=").append(users);
        sb.append('}');
        return sb.toString();
    }

 


}
