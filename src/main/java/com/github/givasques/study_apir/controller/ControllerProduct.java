package com.github.givasques.study_apir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.github.givasques.study_apir.service.ProductService;

@Service
@RestController
@RequestMapping ("produtos")
public class ControllerProduct {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity <String> create() {
        productService.createProduct(null);
        return ResponseEntity.status(201).body("Produto Cadastrado");
    }

    @PutMapping
    public ResponseEntity <String> update() {
        productService.updateProduct(null, null);
        return ResponseEntity.status(200).body("Produto Atualizado");
    }

    @GetMapping
    public ResponseEntity <String> find() {
        productService.getProductById(null);
        return ResponseEntity.status(200).body("Melão");
    }

    @DeleteMapping
    public ResponseEntity <Void> delete() {
        productService.deleteProduct(null);
        return ResponseEntity.status(204).build();
    }

}
