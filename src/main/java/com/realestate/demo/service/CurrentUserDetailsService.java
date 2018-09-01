package com.realestate.demo.service;

import com.realestate.demo.model.User;
import com.realestate.demo.repository.UserRepository;
import com.realestate.demo.security.CurrentUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CurrentUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> email = userRepository.findByEmail(username);
        if(!email.isPresent()){
            throw new UsernameNotFoundException(String.format("User with %s email does not exists",username));
        }
        return new CurrentUser(email.get());
    }
}
