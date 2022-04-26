package com.rubensrangel.ClientConsult;

import com.rubensrangel.ClientConsult.repositories.ArquivoXmlRepo;
import com.rubensrangel.ClientConsult.repositories.ClienteRepo;
import com.rubensrangel.ClientConsult.repositories.TelefoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAutoConfiguration
@EnableScheduling
public class ClientConsultApplication {


    public static void main(String[] args) {
        SpringApplication.run(ClientConsultApplication.class, args);
    }
}

//        RestTemplate template = new RestTemplate();
//
//        //https://jsonplaceholder.typicode.com/posts/1/comments
//
//        UriComponents uri = UriComponentsBuilder.newInstance()
//                .scheme("http")
//                .host("jsonplaceholder.typicode.com")
//                .path("posts/1/comments")
//                .build();
//
//        // ResponseEntity<Cliente> entity = template.getForEntity(uri.toUriString(), Cliente.class);
//        //   System.out.println(entity.getBody().getName());