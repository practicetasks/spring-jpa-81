package com.practice.springjpa81.dto;

import lombok.Data;

import java.util.Map;

@Data
public class ProductDto {
    private Long id;
    private String name;
    private Double price;
    private String categoryName;
    private Map<String, String> options;
}
