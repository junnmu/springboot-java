package com.jun.spring.repositories;

import com.jun.spring.entities.Category;
import com.jun.spring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

// Não preciso da anotação de que é um @Repository, pois já estou herdando de um!
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
