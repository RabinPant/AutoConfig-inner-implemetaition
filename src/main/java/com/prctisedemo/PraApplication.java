package com.prctisedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PraApplication implements CommandLineRunner {

	@Autowired
	private DataConfig dataConfig;

	public static void main(String[] args) {
		SpringApplication.run(PraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		dataConfig.makeConnection();
	}
}
