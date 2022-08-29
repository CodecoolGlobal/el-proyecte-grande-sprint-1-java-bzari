package com.codecool.service.repository;

import com.codecool.model.user.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<ApplicationUser, Long> {

    ApplicationUser getUsersById(Long userId);

    ApplicationUser getApplicationUserByUsername(String username);
}
