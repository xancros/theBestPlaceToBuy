package com.TheBestPlaceToBuy.TheBestPlaceToBuy.service;

import com.TheBestPlaceToBuy.TheBestPlaceToBuy.entity.Product;
import com.TheBestPlaceToBuy.TheBestPlaceToBuy.model.ProductModel;
import com.TheBestPlaceToBuy.TheBestPlaceToBuy.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService (ProductRepository productRepository){this.productRepository=productRepository;}

    public int addProduct(ProductModel pm){
        Product p = new Product(pm.getName(),pm.getCategory(),pm.getPrice(),pm.getVisibility());
        try{
            productRepository.save(p);
            return 1;
        }catch (Exception ex){
            return 0;
        }
    }

    public Optional<Product> getProductById(Long id){
        return productRepository.findById(id);
    }

    public Iterable<Product> getAllProducts(){return productRepository.findAll();}



}
