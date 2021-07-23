package com.cts.estock;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.springframework.boot.SpringApplication;

public class test {
    public static void main(String[] args) {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://user1:root@cluster0.yddqs.mongodb.net/estockdb?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        MongoClient mongoClient = MongoClients.create(settings);
        MongoDatabase database = mongoClient.getDatabase("company");
//        MongoClient mongo = new MongoClient("localhost", 27017);
    }
}
