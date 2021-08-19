package com.demoprofiling.ProfilingDemo.controller;


import com.demoprofiling.ProfilingDemo.model.User;
import com.demoprofiling.ProfilingDemo.service.UserService;
import org.apache.catalina.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private UserService service;

    @GetMapping("/findAllUsers")
    public List<User> findAllUsers(){
        return service.getUsers();
    }
}
