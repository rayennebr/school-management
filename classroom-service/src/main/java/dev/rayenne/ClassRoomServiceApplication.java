package dev.rayenne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableDiscoveryClient
public class ClassRoomServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClassRoomServiceApplication.class, args);
    }
}