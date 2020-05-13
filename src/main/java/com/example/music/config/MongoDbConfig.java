package com.example.music.config;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = {"com.example.music.domain.repository"})
public class MongoDbConfig {

}
