package com.example.oasis.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public MongoDbFactory mongoDbFactory() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        return new SimpleMongoDbFactory(mongoClient, "oasis");
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
        return mongoTemplate;
    }
}
