package com.TheBestPlaceToBuy.TheBestPlaceToBuy.controller;

import com.TheBestPlaceToBuy.TheBestPlaceToBuy.entity.Product;
import com.TheBestPlaceToBuy.TheBestPlaceToBuy.model.ProductModel;
import com.TheBestPlaceToBuy.TheBestPlaceToBuy.service.ProductService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController (ProductService productService){this.productService=productService;}

    @PostMapping(path = "/addProduct")
    @ApiOperation(value = "Add the specified product to the database",
            response = Integer.class,
            notes = "Provide in JSON format a product following the model description. 1 -> OK | 0 -> KO")
    public int addProduct(@RequestBody ProductModel pm, HttpServletResponse response){
        if(productService.addProduct(pm) == 1){
            response.setStatus(HttpServletResponse.SC_CREATED);
            return 1;
        }else{
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return 0;
        }
    }

    @GetMapping(path = "/allProducts")
    @ApiOperation(value = "Retrieve all the products in the database",
            notes = "Returns an Iterable object of Products",
            response = Iterable.class)
    public Iterable<Product> getAllProducts(){return productService.getAllProducts();}

    @GetMapping(path = "/findProduct{id}")
    @ApiOperation(value = "Find a specified product by id",
    notes = "Provide the ID number of the product",
    response = Product.class)
    public Product findProductById(@PathVariable("id") Long id){
        return productService.getProductById(id).orElse(null);
    }
}
