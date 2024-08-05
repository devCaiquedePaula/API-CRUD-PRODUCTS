package com.stoom.productApiCrud.services;

import com.stoom.productApiCrud.models.ProductModel;
import com.stoom.productApiCrud.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductModel> findAll() {
        return productRepository.findAll();
    }
    public ProductModel findById(Long id) {
        return productRepository.findById(id);
    }
    public void save(ProductModel productModel) {
        productRepository.save(productModel);
    }
    public void delete(Long id) {
        productRepository.delete(id);
    }
}
