package com.cts.estock;

import com.mongodb.client.MongoClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
public class EStockRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(EStockRegisterApplication.class, args);
	}

}
