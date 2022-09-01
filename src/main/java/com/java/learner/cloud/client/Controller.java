package com.java.learner.cloud.client;

import com.java.learner.cloud.dto.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    @Autowired
    IUserClient iUserClient;


    @GetMapping("/jsonprovider/users")
    public List<UserResponse> findAllUsers(){
        return iUserClient.getAllUsers();
    }
}



