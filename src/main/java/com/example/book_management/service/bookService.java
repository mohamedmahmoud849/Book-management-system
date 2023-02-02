package com.example.book_management.service;

import com.example.book_management.entity.book;
import com.example.book_management.repository.bookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class bookService {
    private final bookRepo bookRepo;

    public List<book> findBooks(){
        return bookRepo.findAll();
    }
    public book findBookById(String id){
        return bookRepo.findById(id).get();
    }
    public void addBook(book book){
        bookRepo.save(book);
    }
    public void delete(String id){
        bookRepo.deleteById(id);
    }

}
