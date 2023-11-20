package edu.jcsc.springwebjpah2swagger.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.jcsc.springwebjpah2swagger.model.Product;
import edu.jcsc.springwebjpah2swagger.repository.ProductRepository;

@RestController
public class ProductController  {
    
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/product")
    public List<Product> ProductList() {
        return productRepository.findAll();
    }
    
    @GetMapping("/product/{id}")
    public Optional<Product> getOne(Integer id) {
        return productRepository.findById(id);
    }

    @PostMapping("/product")
    public void appProduct(Product product) {
        productRepository.save(product);
    }

    @PutMapping("/product")
    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }

}
