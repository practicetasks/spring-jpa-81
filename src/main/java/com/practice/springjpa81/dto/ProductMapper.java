package com.practice.springjpa81.dto;

import com.practice.springjpa81.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    // Из Product в ProductDto
    public ProductDto toDto(Product product) {
        ProductDto dto = new ProductDto();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setPrice(product.getPrice());
        dto.setCategoryName(product.getCategory().getName());
        return dto;
    }
}
