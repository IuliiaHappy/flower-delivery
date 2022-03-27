package com.epam.controller;

import com.epam.dto.ProductDTO;
import com.epam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public List<ProductDTO> getAll() {
        return productService.getAll();
    }

    @PostMapping()
    public Long create(@RequestBody ProductDTO productDTO) {
        return productService.create(productDTO);
    }
}
