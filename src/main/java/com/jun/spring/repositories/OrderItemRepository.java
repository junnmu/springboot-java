package com.jun.spring.repositories;

import com.jun.spring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

// Não preciso da anotação de que é um @Repository, pois já estou herdando de um!
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
