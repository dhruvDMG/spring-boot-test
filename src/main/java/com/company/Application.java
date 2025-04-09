package com.company;

import com.company.entity.User;
import com.company.services.repository.UserRepository;
import com.github.javafaker.Faker;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.company")
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

//	@Bean
//	CommandLineRunner init(UserRepository userRepository) {
//		return args -> {
//			Faker faker = new Faker();
//			List<User> users = new ArrayList<>();
//
//			for (int i = 0; i < 100_000; i++) {
//				String first = faker.name().firstName();
//				String middle = faker.name().firstName();
//				String last = faker.name().lastName();
//				String username = faker.name().username();
//				String email = username + "@example.com";
//				String password = UUID.randomUUID().toString().substring(0, 8);
//				LocalDate dob = faker.date().birthday(18, 60).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//				LocalDateTime createdAt = LocalDateTime.now().minusDays(faker.number().numberBetween(0, 365));
//				boolean isActive = faker.bool().bool();
//
//				users.add(new User(first, middle, last, username, email, password, dob, createdAt, isActive));
//			}
//
//			userRepository.saveAll(users);
//		};
//	}
}            