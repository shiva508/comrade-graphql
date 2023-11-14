package com.comrade;

import com.comrade.model.Comrade;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.graphql.client.RSocketGraphQlClient;

@SpringBootApplication
public class GraphqlClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlClientApplication.class, args);
    }
    @Bean
    public ApplicationRunner applicationRunner(RSocketGraphQlClient rSocketGraphQlClient, HttpGraphQlClient httpGraphQlClient){
        return args->{
            var httpRequestDocument = """
                     {
                       comradeById(id:408){
                         id
                         name
                       }
                     }
                    """;
            httpGraphQlClient.document(httpRequestDocument).retrieve("comradeById").toEntity(Comrade.class).subscribe(System.out::println);
        };
    }
}