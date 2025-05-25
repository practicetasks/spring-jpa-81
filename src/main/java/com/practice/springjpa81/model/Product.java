package com.practice.springjpa81.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<Value> values;
}

// DTO (Data Transfer Object)
//class User {
//    String name;
//    String lastname;
//    String address;
//    String password;
//    String email;
//    LocalDate birthday;
//}
//
//class UserReadDto {
//    String name;
//    String lastname;
//}

