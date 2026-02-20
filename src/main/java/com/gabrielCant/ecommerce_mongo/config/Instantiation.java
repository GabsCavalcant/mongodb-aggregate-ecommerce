package com.gabrielCant.ecommerce_mongo.config;

import com.gabrielCant.ecommerce_mongo.domain.User;
import com.gabrielCant.ecommerce_mongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository repo;

    @Override
    public void run(String... args) throws Exception {
        repo.deleteAll(); // Limpa o Compass para testar a conexão real
        
        User u1 = new User(null, "Gabriel", "Gabs@gmail.com");
        User u2 = new User(null, "Sthe", "sthe2@gmail.com");
        
        repo.saveAll(Arrays.asList(u1, u2));
        System.out.println(">>> SUCESSO: SPRING ESCREVEU NO MONGO!");
    }
}