package com.mongo.tienda.tiendaenmongo.models;

import javax.persistence.Id;

public class Product {

    @Id
    public String id;

    public String name;

    public String description;

    public String price;

    public String stock;

    public String provider;

    public String url;

    public Product(){}

    public Product(String id, String name, String description, String price, String stock, String provider, String url) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.provider = provider;
        this.url = url;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", stock='" + stock + '\'' +
                ", provider='" + provider + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
