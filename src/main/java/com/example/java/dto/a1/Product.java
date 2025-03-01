package com.example.java.dto.a1;

import lombok.Data;

import java.util.List;

@Data
public class Product {
    private Integer id;
    private String name;
    private Boolean available;
    private List<String> shops;
    private Attribute attribute;
}
