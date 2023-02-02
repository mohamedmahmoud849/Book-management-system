package com.example.book_management.controller;

import com.example.book_management.entity.book;
import com.example.book_management.service.bookService;
import com.example.book_management.service.myBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class bookControl {
    final bookService bookService;
    final myBookService myBookService;
    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/register_book")
    public String registerBook(){
        return "new_book";
    }
    @GetMapping("/user_books")
    public ModelAndView userBooks(){
        return new ModelAndView("my_books","Books",myBookService.findBooks());
    }
    @GetMapping("/books_list")
    public ModelAndView booksList(){
        return new ModelAndView("available_books","books",bookService.findBooks());
    }
    @PostMapping("/save")
    public String addBook(@ModelAttribute book book){
        bookService.addBook(book);
        return "redirect:/books_list";
    }
    @RequestMapping("/add_book/{id}")
    public String addToUserBooks(@PathVariable String id){
        myBookService.addBookFromBooksList(bookService.findBookById(id));
        return "redirect:/user_books";
    }
    @RequestMapping("/delete_book/{id}")
    public String deleteUserBooks(@PathVariable String id){
        myBookService.delete(id);
        return "redirect:/user_books";
    }
    @RequestMapping("/delete_booke/{id}")
    public String deleteFromBooks(@PathVariable String id){
        bookService.delete(id);
        return "redirect:/books_list";
    }
    @RequestMapping("/edit_book/{id}")
    public String editBooks(@PathVariable String id, Model model){
        book b= bookService.findBookById(id);
        model.addAttribute("book",b);
        return "book_edit";
    }
}
