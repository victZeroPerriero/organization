package com.example.organization;

import com.example.organization.model.Organization;
import com.example.organization.repo.OrganizationRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OrganizationApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrganizationApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(OrganizationRepo repo){
        return args -> {
            repo.save(new Organization("software","antivirus"));
            repo.save(new Organization("game application","maincraft"));
            repo.save(new Organization("software","linux"));

        };
    }

}
