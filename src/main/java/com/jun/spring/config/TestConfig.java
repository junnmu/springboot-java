package com.jun.spring.config;

import com.jun.spring.entities.Order;
import com.jun.spring.entities.User;
import com.jun.spring.entities.enums.OrderStatus;
import com.jun.spring.repositories.OrderRepository;
import com.jun.spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

// Classe de configuração para que nosso banco seja instanciado e populado com alguns valores
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    // Anotação de injeção de dependência automática do spring (daora!!!)
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2020-12-07T19:53:07Z"), OrderStatus.WAITING_PAYMENT, u1);
        Order o2 = new Order(null, Instant.parse("2020-12-07T03:42:10Z"), OrderStatus.CANCELED, u2);
        Order o3 = new Order(null, Instant.parse("2020-12-07T15:21:22Z"), OrderStatus.CANCELED, u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
