package com.epam.util;

import com.epam.dto.NewOrderDTO;
import com.epam.dto.ProductDTO;
import com.epam.entity.Client;
import com.epam.entity.Order;
import com.epam.entity.Product;

import java.util.stream.Collectors;

public class ConvertManager {
    public static Product convert(ProductDTO productDTO) {
        if (productDTO == null) {
            throw new IllegalArgumentException();
        }
        return new Product(productDTO.getId(), productDTO.getName(), productDTO.getCost());
    }

    public static Order convert(NewOrderDTO newOrderDTO) {
        if (newOrderDTO == null) {
            throw new IllegalArgumentException();
        }
        return new Order(
                newOrderDTO.getId(),
                new Client(newOrderDTO.getClientId()),
                newOrderDTO.getProductIds().stream().map(Product::new).collect(Collectors.toSet()),
                newOrderDTO.getCost(),
                newOrderDTO.getAddress());
    }
}
