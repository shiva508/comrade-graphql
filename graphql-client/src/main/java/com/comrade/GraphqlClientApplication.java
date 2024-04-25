package com.comrade;

import com.comrade.service.GraphQlService;
import com.comrade.service.ShowService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.comrade.*;
@SpringBootApplication
public class GraphqlClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlClientApplication.class, args);
    }
    @Bean
    public ApplicationRunner applicationRunner(GraphQlService graphQlService, ShowService showService){
        return args->{
            //graphQlService.comradeById(408);
            showService.getShows();
        };

    }
}