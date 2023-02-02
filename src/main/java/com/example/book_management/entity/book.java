package com.example.book_management.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "books")
public class book {
    @Id
    private String id;
    private String name;
    private String auther;
    private String price;
}
