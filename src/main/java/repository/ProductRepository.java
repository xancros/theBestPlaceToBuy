package repository;

import dataAccessObject.ProductDao;
import entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("mysql")
public interface ProductRepository extends JpaRepository<Product,Long> {


}
