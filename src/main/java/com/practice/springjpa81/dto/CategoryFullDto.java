package com.practice.springjpa81.dto;

import lombok.Data;

import java.util.List;

@Data
public class CategoryFullDto {
    private Long id;
    private String name;
    private List<OptionDto> options; // список из названия характеристик

    @Data
    public static class OptionDto {
        private Long id;
        private String name;
    }
}
