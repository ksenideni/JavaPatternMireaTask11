package ru.mirea.task11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Task11Application {

    public static void main(String[] args) {
        SpringApplication.run(Task11Application.class, args);
    }

//    curl -X GET localhost:8080/actuator/health
//    curl -X POST localhost:8080/actuator/shutdown

//    mvn clean
//    mvn package

//    run app
//    java -jar target\task11-0.0.1-SNAPSHOT.jar


}

