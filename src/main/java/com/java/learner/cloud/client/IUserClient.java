package com.java.learner.cloud.client;


import com.java.learner.cloud.dto.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="User-Client", url="https://jsonplaceholder.typicode.com/")
public interface IUserClient {

    @GetMapping("/users")
    public List<UserResponse> getAllUsers();



}
