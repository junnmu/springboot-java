package com.jun.spring.config;

import com.jun.spring.entities.User;
import com.jun.spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

// Classe de configuração para que nosso banco seja instanciado e populado com alguns valores
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    // Anotação de injeção de dependência automática do spring (daora!!!)
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
