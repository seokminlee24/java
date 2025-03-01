package com.example.java.dto.c29;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Book {
    private String title;
    private String author;
    private Integer price;
    private LocalDate publishing;
    private String isbn;
}
