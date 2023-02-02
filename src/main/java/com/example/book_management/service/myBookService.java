package com.example.book_management.service;

import com.example.book_management.entity.book;
import com.example.book_management.entity.myBook;
import com.example.book_management.repository.bookRepo;
import com.example.book_management.repository.myBookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class myBookService {
    private final myBookRepo myBookRepo;

    public List<myBook> findBooks(){
        return myBookRepo.findAll();
    }
    public myBook findBookById(String id){
        return myBookRepo.findById(id).get();
    }
    public void addBook(myBook book){
        myBookRepo.insert(book);
    }
    public void addBookFromBooksList(book book){

        myBookRepo.insert(myBook.builder()
                .id(book.getId())
                .name(book.getName())
                .auther(book.getAuther())
                .price(book.getPrice())
                .build());
    }
    public void delete(String id){
        myBookRepo.deleteById(id);
    }
}
