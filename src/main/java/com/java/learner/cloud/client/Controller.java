package com.java.learner.cloud.client;

import com.java.learner.cloud.dto.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    IUserClient iUserClient;

    @GetMapping("/items")
    public List<Item> findAllUsers(){
        return iUserClient.getAllItems();
    }

    @GetMapping("/items/{id}")
    public Item findById(@PathVariable Long id){
        return iUserClient.findById(id);
    }


    @DeleteMapping("/items/{id}")
    public void deleteById(@PathVariable Long id){
        iUserClient.deleteById(id);
    }
}



