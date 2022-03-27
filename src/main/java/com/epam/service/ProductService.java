package com.epam.service;


import com.epam.dto.ProductDTO;
import com.epam.entity.Product;
import com.epam.repository.ProductRepository;
import com.epam.util.ConvertManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDTO> getAll() {
        Iterable<Product> queryResult = productRepository.findAll();
        return StreamSupport.stream(queryResult.spliterator(), false)
                .map(ProductDTO::new)
                .collect(Collectors.toList());
    }

    public Long create(ProductDTO product) {
        return productRepository.save(ConvertManager.convert(product)).getId();
    }
}

