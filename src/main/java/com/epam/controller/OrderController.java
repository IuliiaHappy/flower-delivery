package com.epam.controller;

import com.epam.dto.NewOrderDTO;
import com.epam.dto.OrderDTO;
import com.epam.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping()
    public List<OrderDTO> getAll() {
        return orderService.getAll();
    }

    @GetMapping("/findByClient")
    public List<OrderDTO> getOrderByClient(@RequestParam("id") Long clientId) {
        return orderService.getOrderByClientId(clientId);
    }

    @PostMapping
    public Long create(@RequestBody NewOrderDTO newOrderDTO) {
        return orderService.create(newOrderDTO);
    }
}
