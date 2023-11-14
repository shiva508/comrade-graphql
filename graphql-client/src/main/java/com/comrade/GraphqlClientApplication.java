package com.comrade;

import com.comrade.service.GraphQlService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlClientApplication.class, args);
    }
    @Bean
    public ApplicationRunner applicationRunner(GraphQlService graphQlService){
        return args->{
            graphQlService.comradeById(408);
        };
    }
}