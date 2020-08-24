package com.lightidea.tum;

import java.io.Serializable;

public class Product {

    private String id;

    private String name;

    private double price;

    private String description;

    private int photo;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPhoto() {
        return this.photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public Product() {
    }

    public Product(String id, String name, int photo) {
        this.id = id;
        this.name = name;
        this.photo = photo;
    }
}
