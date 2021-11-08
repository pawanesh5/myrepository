package com.niit.repository;

import com.niit.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product,Integer> {

    @Query("{'productDiscription.brand':{$in : [?0]}}")
    List<Product> findProductByBrand(String brand);

}
