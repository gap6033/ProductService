package xyz.gap.productservice.controllers;
import xyz.gap.productservice.dtos.ProductResponseDto;
import xyz.gap.productservice.models.Product;
import xyz.gap.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product/{id}")
    public ProductResponseDto getProduct(@PathVariable("id") String id) {
        Product product = this.productService.getProduct(id);
        return ProductResponseDto.toResponseDto(product);

    }

    @GetMapping("/product")
    public String getProducts(){
        return "Hello World";

    }

    public void createProduct(){

    }

    public void updateProduct(){

    }

    public void deleteProduct(){

    }
}
