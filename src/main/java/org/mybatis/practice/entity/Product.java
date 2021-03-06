package org.mybatis.practice.entity;

import java.util.Date;

public class Product {
    private Long id;
    private String name;
    private String category;
    private Double price;
    private Integer storage;
    private Date createdAt;

    public Product() {
    }

    public Product(String category, String name, double price, int storage) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.storage = storage;
    }

    public Product(Long id, String category, String name, double price, int storage) {
        this(category, name, price, storage);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
