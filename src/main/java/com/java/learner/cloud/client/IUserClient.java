package com.java.learner.cloud.client;


import com.java.learner.cloud.dto.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="User-Client", url="http://localhost:9090")
public interface IUserClient {

    @GetMapping("/items")
    public List<Item> getAllItems();

    @GetMapping("/items/{id}")
    public Item findById(@PathVariable Long id);



    @DeleteMapping("/items/{id}")
    public void deleteById(@PathVariable Long id);



}
