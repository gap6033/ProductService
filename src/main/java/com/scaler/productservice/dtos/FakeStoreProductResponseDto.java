package com.scaler.productservice.dtos;

import com.scaler.productservice.models.Category;
import com.scaler.productservice.models.Product;
import com.sun.jdi.DoubleValue;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductResponseDto {
    private Long id;
    private String title;
    private String price;
    private String category;
    private String description;
    private String image;


    public static Product toProduct(FakeStoreProductResponseDto dto) {
        Product product = new Product();
        product.setId(dto.getId());
        product.setTitle(dto.getTitle());
        product.setDescription(dto.getDescription());
        product.setImageUrl(dto.getImage());
        product.setPrice(Double.valueOf(dto.getPrice()));

        Category category = new Category();
        category.setName(dto.getCategory());

        product.setCategory(category);
        return product;
    }
}
