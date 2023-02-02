package com.example.book_management.config;

import com.example.book_management.entity.book;
import com.example.book_management.repository.bookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class startUp implements CommandLineRunner {
    private final bookRepo bookRepo;
    @Override
    public void run(String... args) throws Exception {
        if(bookRepo.findAll().isEmpty()){
            bookRepo.insert(book.builder()
                            .name("Java")
                            .auther("Stephen King")
                            .price("500")
                            .build());
            bookRepo.insert(book.builder()
                    .name("Python")
                    .auther("Martin Luther")
                    .price("700")
                    .build());
            bookRepo.insert(book.builder()
                    .name("C#")
                    .auther("Michel Angelo")
                    .price("200")
                    .build());


        }

    }
}
