package com.sanix.Blog.service;

import com.sanix.Blog.dto.RegisterRequest;
import com.sanix.Blog.model.User;
import com.sanix.Blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

//create the User object and storing it in the database
@Service
public class AuthService {


    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public void signup(RegisterRequest registerRequest){
        User user=new User();
        user.setUserName(registerRequest.getUsername());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(encodePassword(registerRequest.getPassword()));

        userRepository.save(user);

    }

    private String encodePassword(String password){
        return passwordEncoder.encode(password);
    }
}
