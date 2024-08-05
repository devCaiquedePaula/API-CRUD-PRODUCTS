package com.stoom.productApiCrud.repositories;

import com.stoom.productApiCrud.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
    List<ProductModel> findAll();
    ProductModel findById(Long idProduct);
    //void save(ProductModel productModel);
    void delete(Long idProduct);
}
