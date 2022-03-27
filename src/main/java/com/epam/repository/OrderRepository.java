package com.epam.repository;

import com.epam.entity.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository  extends CrudRepository<Order, String> {
    @Query("SELECT o FROM Order o WHERE o.client.id=?1")
    public Iterable<Order> findByClientId(Long clientId);
}
