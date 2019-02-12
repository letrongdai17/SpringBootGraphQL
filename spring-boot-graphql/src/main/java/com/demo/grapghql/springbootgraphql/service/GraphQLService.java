package com.demo.grapghql.springbootgraphql.service;

import graphql.GraphQL;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;


@Service
public class GraphQLService {

    private GraphQL graphQL;

    @Value("classpath:books.graphql")
    Resource resource;

    // load schema at application start u


}
