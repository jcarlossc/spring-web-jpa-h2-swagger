package edu.jcsc.springwebjpah2swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.jcsc.springwebjpah2swagger.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
