package com.practice.springjpa81.specifications;

import com.practice.springjpa81.model.Product;
import org.springframework.data.jpa.domain.Specification;

public class ProductSpecifications {
    public static Specification<Product> hasName(String name) {
        return (root, query, cb) -> name == null ? null : cb.like(root.get("name"), "%" + name + "%");
    }

    public static Specification<Product> priceLessThanOrEqual(Double price) {
        return (root, query, cb) -> price == null ? null : cb.lessThanOrEqualTo(root.get("price"), price);
    }
}
