package com.epam;

import com.epam.service.ClientService;
import com.epam.service.OrderService;
import com.epam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    @Autowired
    private ClientService clientService;
    @Autowired
    private ProductService productService;
    @Autowired
    private OrderService orderService;

    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }
}
