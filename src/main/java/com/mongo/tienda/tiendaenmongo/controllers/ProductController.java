package com.mongo.tienda.tiendaenmongo.controllers;

import com.mongo.tienda.tiendaenmongo.models.Product;
import com.mongo.tienda.tiendaenmongo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orden")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:8081")
    public List<Product> getAllOrders(){
        return productRepository.findAll();
    }

    @RequestMapping(value = "/insert_product", method = RequestMethod.POST)
    @CrossOrigin(origins = "http://localhost:8081")
    public Product insertProduct(@RequestBody Product product){
        return productRepository.insert(product);
    }
}
