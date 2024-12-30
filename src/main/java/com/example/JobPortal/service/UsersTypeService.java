package com.example.JobPortal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.JobPortal.entity.UsersType;
import com.example.JobPortal.repository.UsersTypeRepository;

/**
 *
 * @author amitg
 */

@Service
public class UsersTypeService {

    private final UsersTypeRepository usersTypeRepository;

    public UsersTypeService(UsersTypeRepository usersTypeRepository) {
        this.usersTypeRepository = usersTypeRepository;
    }

    public List<UsersType> getAll() {
        return usersTypeRepository.findAll();
    }

}
