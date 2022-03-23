package com.epam;

import com.epam.service.ClientService;
import com.epam.service.OrderService;
import com.epam.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {
    @Autowired
    private ClientService clientService;
    @Autowired
    private ProductService productService;
    @Autowired
    private OrderService orderService;

    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Client");
        clientService.getAll().forEach(System.out::println);

        System.out.println("Product before");
        productService.getAll().forEach(System.out::println);

//        productService.add(new Product("candy", 150));
//        System.out.println("Product after");
//        productService.getAll().forEach(System.out::println);

        System.out.println("Order");
        orderService.getAll().forEach(System.out::println);
    }
}
