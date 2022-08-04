package com.codecool.service.repositories;

import com.codecool.model.user.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {

    Users getUsersById(Long userId);
}
