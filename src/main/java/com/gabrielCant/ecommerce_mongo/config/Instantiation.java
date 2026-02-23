package com.gabrielCant.ecommerce_mongo.config;

import com.gabrielCant.ecommerce_mongo.domain.Post;
import com.gabrielCant.ecommerce_mongo.domain.User;
import com.gabrielCant.ecommerce_mongo.dto.AuthorDto;
import com.gabrielCant.ecommerce_mongo.repository.PostRepository;
import com.gabrielCant.ecommerce_mongo.repository.UserRepository;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;
import java.util.TimeZone;

import java.util.Date;
@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository repo;
    
    @Autowired
    private PostRepository postRepo;

    @Override
    public void run(String... args) throws Exception {
        repo.deleteAll();// Limpa o Compass para testar a conexão real
        postRepo.deleteAll();
        
       SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
       data.setTimeZone(TimeZone.getTimeZone("GMT"));
        
        User u1 = new User(null, "Gabriel", "Gabs@gmail.com");
        User u2 = new User(null, "Sthe", "sthe2@gmail.com");
        
        repo.saveAll(Arrays.asList(u1, u2));
        
       Post p1 = new Post(null, data.parse("20/09/2002"), "Chuva", "CaiChuva", new AuthorDto(u1));
       Post p2 = new Post(null, data.parse("30/04/2022"), "Sol", "MoLua", new AuthorDto(u2));
       
      postRepo.saveAll(Arrays.asList(p1,p2));
        
    }
}