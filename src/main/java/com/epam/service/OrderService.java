package com.epam.service;

import com.epam.dto.NewOrderDTO;
import com.epam.dto.OrderDTO;
import com.epam.entity.Order;
import com.epam.repository.OrderRepository;
import com.epam.util.ConvertManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<OrderDTO> getAll() {
        Iterable<Order> queryResult = orderRepository.findAll();
        return StreamSupport.stream(queryResult.spliterator(), false)
                .map(OrderDTO::new)
                .collect(Collectors.toList());
    }

    public List<OrderDTO> getOrderByClientId(Long clientId) {
        Iterable<Order> queryResult = orderRepository.findByClientId(clientId);
        return StreamSupport.stream(queryResult.spliterator(), false)
                .map(OrderDTO::new)
                .collect(Collectors.toList());
    }

    public Long create(NewOrderDTO newOrderDTO) {
        return orderRepository.save(ConvertManager.convert(newOrderDTO)).getId();
    }
}
