package com.codecool.service.users;

import com.codecool.model.user.Users;
import com.codecool.service.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsersService {
    @Autowired
    UserRepository userRepository;

    public Users getUsersById(Long userId){
        return userRepository.getUsersById(userId);
    }
}
