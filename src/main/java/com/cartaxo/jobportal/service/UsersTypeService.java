package com.cartaxo.jobportal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cartaxo.jobportal.model.UsersType;
import com.cartaxo.jobportal.repository.UsersTypeRepository;

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
