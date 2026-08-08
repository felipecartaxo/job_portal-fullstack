package com.cartaxo.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cartaxo.jobportal.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
    
}
