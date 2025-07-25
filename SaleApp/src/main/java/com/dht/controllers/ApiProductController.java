/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dht.controllers;

import com.dht.pojo.Comment;
import com.dht.pojo.Product;
import com.dht.services.ProductService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author admin
 */
@RestController
@RequestMapping("/api")
@CrossOrigin
public class ApiProductController {

    @Autowired
    private ProductService prodService;

    @DeleteMapping("/products/{productId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void destroy(@PathVariable(value = "productId") int id) {
        this.prodService.deleleProduct(id);
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> list(@RequestParam Map<String, String> params) {
        return new ResponseEntity<>(this.prodService.getProducts(params), HttpStatus.OK);
    }

    @GetMapping("/products/{productId}")
    public ResponseEntity<Product> retrieve(@PathVariable(value = "productId") int id) {
        return new ResponseEntity<>(this.prodService.getProductById(id), HttpStatus.OK);
    }

    @GetMapping("/products/{productId}/comments")
    public ResponseEntity<List<Comment>> getComments(@PathVariable(value = "productId") int id) {
        return new ResponseEntity<>(this.prodService.getComments(id), HttpStatus.OK);
    }
}
