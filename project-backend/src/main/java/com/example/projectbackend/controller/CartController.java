package com.example.projectbackend.controller;

import com.example.projectbackend.model.Cart;
import com.example.projectbackend.model.Product;
import com.example.projectbackend.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v2")
public class CartController {
    @Autowired
    private CartRepository cartRepository;

    @GetMapping("/cart")
    public List<Cart> getCartProducts(){
        return cartRepository.findAll();
    }

    @PostMapping("/cart")
    public Cart createProduct(@RequestBody Cart cart){
        return cartRepository.save(cart);
    }

}
