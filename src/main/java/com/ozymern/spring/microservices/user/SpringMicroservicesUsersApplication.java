package com.ozymern.spring.microservices.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//para que detecte user y role commonds
@EntityScan({"com.ozymern.spring.microservices.commons.models.entity"})
public class SpringMicroservicesUsersApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMicroservicesUsersApplication.class, args);
    }

}
