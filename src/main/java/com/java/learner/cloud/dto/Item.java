package com.java.learner.cloud.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Item {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("quantity")
    private int quantity;

    @JsonProperty("upc")
    private long upc;

    @JsonProperty("color")
    private String color;

    @JsonProperty("price")
    private double price;

    @JsonProperty("discount")
    private double discount;


}
