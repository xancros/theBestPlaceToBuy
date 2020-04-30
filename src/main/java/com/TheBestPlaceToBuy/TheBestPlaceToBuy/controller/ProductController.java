package com.TheBestPlaceToBuy.TheBestPlaceToBuy.controller;

import com.TheBestPlaceToBuy.TheBestPlaceToBuy.entity.Product;
import com.TheBestPlaceToBuy.TheBestPlaceToBuy.model.ProductModel;
import com.TheBestPlaceToBuy.TheBestPlaceToBuy.service.ProductService;
import org.hibernate.validator.internal.util.ConcurrentReferenceHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController (ProductService productService){this.productService=productService;}

    @PostMapping(path = "/addProduct")
    public int addProduct(@RequestBody ProductModel pm){

        return this.productService.addProduct(pm);
    }

    @GetMapping(path = "/allProducts")
    public Iterable<Product> getAllProducts(){return productService.getAllProducts();}

    @GetMapping(path = "/findProduct{id}")
    public Product findProductById(@PathVariable("id") Long id){
        return productService.getProductById(id).orElse(null);
    }
}
