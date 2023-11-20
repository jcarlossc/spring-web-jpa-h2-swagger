package edu.jcsc.springwebjpah2swagger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.jcsc.springwebjpah2swagger.model.Product;
import edu.jcsc.springwebjpah2swagger.repository.ProductRepository;

@Component
public class App implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;
    
    @Override
    public void run(String... args) throws Exception {

        Product p1 = new Product("caneta", 1.58);
        Product p2 = new Product("borracha", 2.12);

        productRepository.save(p1);
        productRepository.save(p2);

        System.out.println("TESTANDO");
    }
}
