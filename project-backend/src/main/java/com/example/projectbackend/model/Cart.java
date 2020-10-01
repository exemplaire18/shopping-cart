package com.example.projectbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "cartproducts")
public class Cart {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(name="product_name")
    private String productName;

    @Column(name = "product_price")
    private long productPrice;

    @Column(name = "description")
    private String description;

    @Column(name = "quantity")
    private String quantity;

    public Cart(){

    }

    public Cart(String productName, long productPrice, String description, String quantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.description = description;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(long productPrice) {
        this.productPrice = productPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
