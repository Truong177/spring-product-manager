package com.example.productmanager.repositories.impl;

import com.example.productmanager.models.Product;
import com.example.productmanager.repositories.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository {

    private static final List<Product> products;

    static {
        products = new ArrayList<>();
        products.add(new Product(1, "iPhone 13", "Apple", 999.99, 50));
        products.add(new Product(2, "Galaxy S21", "Samsung", 799.99, 30));
        products.add(new Product(3, "Pixel 6", "Google", 599.99, 20));
        products.add(new Product(4, "OnePlus 9", "OnePlus", 729.99, 40));
        products.add(new Product(5, "Xperia 5 II", "Sony", 949.99, 15));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products);
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id-1);
    }

    @Override
    public void remove(int id) {
        products.remove(id-1);
    }

    @Override
    public void update(int id, Product product) {
        products.add(id,product);
    }
}
