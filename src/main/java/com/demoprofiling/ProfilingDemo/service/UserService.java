package com.demoprofiling.ProfilingDemo.service;

import com.demoprofiling.ProfilingDemo.model.User;
import com.demoprofiling.ProfilingDemo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Profile(value = {"demo", "dev"})
public class UserService {

    @Autowired
    private UserRepo userRepo;
    public List<User> getUsers(){
        return userRepo.findAll();
    }
}
