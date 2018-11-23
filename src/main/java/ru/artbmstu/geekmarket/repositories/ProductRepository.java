package ru.artbmstu.geekmarket.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.artbmstu.geekmarket.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

    @Override
    Iterable<Product> findAll();
}
