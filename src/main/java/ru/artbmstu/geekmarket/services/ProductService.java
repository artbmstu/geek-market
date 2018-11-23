package ru.artbmstu.geekmarket.services;

import ru.artbmstu.geekmarket.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
}