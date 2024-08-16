package com.scaler.productservice.services;

import com.scaler.productservice.dtos.FakeStoreProductResponseDto;
import com.scaler.productservice.dtos.ProductResponseDto;
import com.scaler.productservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService implements ProductService {

    private final RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Override
    public Product getProduct(String productId) {
       FakeStoreProductResponseDto productResponseDto = restTemplate.getForObject("https://fakestoreapi.com/products/"+ productId, FakeStoreProductResponseDto.class);

        assert productResponseDto != null;
        return FakeStoreProductResponseDto.toProduct(productResponseDto);
    }
}
