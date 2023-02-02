package com.example.book_management.repository;

import com.example.book_management.entity.myBook;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface myBookRepo extends MongoRepository<myBook,String> {
}
