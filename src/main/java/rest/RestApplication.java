package rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import Entity.Aluno;
import Service.AlunoService;

@SpringBootApplication(scanBasePackages = {"Controller", "Entity" , "Repository", "Service"})
@EnableJpaRepositories("Repository")
@EntityScan("Entity")
@ComponentScan(basePackages =  {"Controller", "Entity" , "Repository", "Service"})
public class RestApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

}
