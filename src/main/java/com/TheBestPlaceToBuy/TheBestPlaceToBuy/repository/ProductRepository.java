package com.TheBestPlaceToBuy.TheBestPlaceToBuy.repository;

import com.TheBestPlaceToBuy.TheBestPlaceToBuy.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {
}
