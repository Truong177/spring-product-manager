package com.example.productmanager.services.impl;

import com.example.productmanager.models.Product;
import com.example.productmanager.repositories.IProductRepository;
import com.example.productmanager.repositories.impl.ProductRepository;
import com.example.productmanager.services.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product product) {
        product.setId((int) (Math.random() * 10000));
        productRepository.save(product);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void remove(int id) {
        productRepository.remove(id);
    }

    @Override
    public void update(int id, Product product) {
        productRepository.update(id,product);
    }
}
