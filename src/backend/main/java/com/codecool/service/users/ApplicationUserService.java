package com.codecool.service.users;

import com.codecool.model.user.ApplicationUser;
import com.codecool.service.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationUserService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    public ApplicationUser getUsersById(Long userId){
        return userRepository.getUsersById(userId);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
