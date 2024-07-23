package com.codingvishalrai.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestFullApiApplication  implements CommandLineRunner {
	@Autowired
    DB db;
	public static void main(String[] args) {
		SpringApplication.run(RestFullApiApplication.class, args);
		//System.out.println("Spring Boot Run Successfully ");
	}

	@Override
	public void run(String... args) throws Exception {
		db= (DB) new prodDB();
		System.out.println(db.getData());

	}
}
