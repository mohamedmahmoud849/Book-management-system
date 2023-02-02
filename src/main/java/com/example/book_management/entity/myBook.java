package com.example.book_management.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "my_books")
public class myBook {
    @Id
    private String id;
    private String name;
    private String auther;
    private String price;
}
