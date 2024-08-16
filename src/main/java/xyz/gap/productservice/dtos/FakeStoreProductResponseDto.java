package xyz.gap.productservice.dtos;

import xyz.gap.productservice.models.Category;
import xyz.gap.productservice.models.Product;
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
