package com.comrade.service;

import com.comrade.model.Show;
import com.comrade.utill.DgsUtil;
import com.netflix.graphql.dgs.InputArgument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class SpringShowsDataFetcher {

    @QueryMapping
    public List<Show> springShows(@InputArgument Integer releaseYear){
        if (releaseYear == null){
            return DgsUtil.shows;
        }
        return DgsUtil.shows.stream().filter(show -> show.releaseYear()>=releaseYear).collect(Collectors.toList());
    }
}
