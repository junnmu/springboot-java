package com.jun.spring.repositories;

import com.jun.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Não preciso da anotação de que é um @Repository, pois já estou herdando de um!
public interface UserRepository extends JpaRepository<User, Long> {

}
