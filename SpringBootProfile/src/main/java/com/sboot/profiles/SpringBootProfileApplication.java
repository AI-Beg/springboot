package com.sboot.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sboot.profiles.entity.MultipleDatabseEnity;
import com.sboot.profiles.repo.SqlRepo;

@SpringBootApplication
public class SpringBootProfileApplication implements CommandLineRunner {

	private SqlRepo sqlRepo;

	@Autowired
	public SpringBootProfileApplication(SqlRepo sqlRepo) {
		super();
		this.sqlRepo = sqlRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfileApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		MultipleDatabseEnity multipleDatabseEnity = new MultipleDatabseEnity();
		multipleDatabseEnity.setName("Abc");
		multipleDatabseEnity.setMobnumber(919827364);

		sqlRepo.save(multipleDatabseEnity);

	}

}
