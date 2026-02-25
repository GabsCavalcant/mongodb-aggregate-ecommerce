package com.gabrielCant.ecommerce_mongo.config;

import com.gabrielCant.ecommerce_mongo.domain.Post;
import com.gabrielCant.ecommerce_mongo.domain.User;
import com.gabrielCant.ecommerce_mongo.dto.AuthorDto;
import com.gabrielCant.ecommerce_mongo.dto.CommentDto;
import com.gabrielCant.ecommerce_mongo.repository.PostRepository;
import com.gabrielCant.ecommerce_mongo.repository.UserRepository;
import java.text.SimpleDateFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;
import java.util.TimeZone;

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
        User u3 = new User(null, "Thiago", "thi@gmail.com");
        
        
        repo.saveAll(Arrays.asList(u1, u2,u3));
        
       Post p1 = new Post(null, data.parse("20/09/2012"), "Chuva", "CaiChuva", new AuthorDto(u1));
       Post p2 = new Post(null, data.parse("20/09/2002"), "Nublado!", "Tempo Nublado", new AuthorDto(u1));
       Post p3 = new Post(null, data.parse("03/04/2021"), "Basnte Sol", "MoLua", new AuthorDto(u2));
       Post p4 = new Post(null, data.parse("03/04/2025"), "Mas mttt sol", "atpe dms", new AuthorDto(u2));
     
       
       CommentDto c1 = new CommentDto("Muita chuva!", data.parse("25/09/2012"), new AuthorDto(u3));
       CommentDto c2 = new CommentDto("Muito sol msm!", data.parse("10/07/2025"), new AuthorDto(u2));
       CommentDto c3 = new CommentDto("Muito, muito sol!", data.parse("10/05/2025"), new AuthorDto(u2));
       CommentDto c4 = new CommentDto("Divertido!!", data.parse("10/05/2021"), new AuthorDto(u1));
       CommentDto c5 = new CommentDto("Muito chato!", data.parse("12/05/2023"), new AuthorDto(u1));
       
       
       
       p1.getComments().addAll(Arrays.asList(c1));
       p2.getComments().addAll(Arrays.asList(c2,c3));
      
       p3.getComments().addAll(Arrays.asList(c4,c5));
       
      postRepo.saveAll(Arrays.asList(p1,p2,p3,p4));
      
      u1.getPost().addAll(Arrays.asList(p1,p2));
      u2.getPost().addAll(Arrays.asList(p3,p4));
      
     
      repo.save(u1);
      repo.save(u2);
        
    }
}