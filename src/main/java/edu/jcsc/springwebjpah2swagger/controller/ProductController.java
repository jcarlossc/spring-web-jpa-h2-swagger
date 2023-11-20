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
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class ProductController {
    
    @Autowired
    private ProductRepository productRepository;

    @Operation( 
            summary = "Busca todos os Produtos", 
            description = "Busca todas as entidades de Produto e seus dados da base de dados") 
    @ApiResponses( value = { 
            @ApiResponse(responseCode = "200", description = "Operação bem-sucedida") 
    })
    @GetMapping("/product")
    public List<Product> listProduct() {
        return productRepository.findAll();
    }
    
    @Operation( 
        summary = "Busca um Produto", 
        description = "Busca uma entidade de Produto e seus dados da base de dados") 
    @ApiResponses( value = { 
        @ApiResponse(responseCode = "200", description = "Operação bem-sucedida") 
    })
    @GetMapping("/product/{id}")
    public Optional<Product> getOne(Integer id) {
        return productRepository.findById(id);
    }

    @Operation( 
        summary = "Salva Produto", 
        description = "Salva uma entidade de Produto e seus dados na base de dados") 
    @ApiResponses( value = { 
        @ApiResponse(responseCode = "200", description = "Operação bem-sucedida") 
    })
    @PostMapping("/product")
    public void appProduct(Product product) {
        productRepository.save(product);
    }

    @Operation( 
        summary = "Atualiza um Produto", 
        description = "Atualiza uma entidade de Produto e seus dados da base de dados") 
    @ApiResponses( value = { 
        @ApiResponse(responseCode = "200", description = "Operação bem-sucedida") 
    })
    @PutMapping("/product")
    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    @Operation( 
        summary = "Deleta um Produto", 
        description = "Deleta uma entidade de Produto e seus dados da base de dados") 
    @ApiResponses( value = { 
        @ApiResponse(responseCode = "200", description = "Operação bem-sucedida") 
    })
    @DeleteMapping("/product/{id}")
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }

}
