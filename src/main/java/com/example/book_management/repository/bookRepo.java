package com.example.book_management.repository;

import com.example.book_management.entity.book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bookRepo extends MongoRepository<book,String> {

}
