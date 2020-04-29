package service;

import dataAccessObject.ProductDao;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductDao productDao;

    @Autowired
    public ProductService (@Qualifier("mysql") ProductDao productDao){
        this.productDao=productDao;
    }

    /*public int addProduct(Product p){
        return productDao.insert(p);
    }

    public int addStock(List<Product> stock){
        int output = 1;
        for(Product p: stock){
            if(productDao.insert(p)!=1)
                output=0;
        }
        return output;
    }

    public int removeProduct(Product p){
        return productDao.remove(p);
    }

    public Optional<Product> findProductById(Long id){
        return productDao.findById(id);
    }

    public List<Product> findProductsByCategory(int category){
        return productDao.findProductsByCategory(category);
    }

    public List<Product> getAllProducts(){
        return productDao.getAllProducts();
    }

    public int modifyProduct (Product p){
        return productDao.moddify(p);
    }*/


}
