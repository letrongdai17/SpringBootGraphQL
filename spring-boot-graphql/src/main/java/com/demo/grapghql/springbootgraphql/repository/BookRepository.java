package com.demo.grapghql.springbootgraphql.repository;

import com.demo.grapghql.springbootgraphql.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {

}
