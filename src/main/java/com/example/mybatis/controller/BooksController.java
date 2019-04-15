package com.example.mybatis.controller;

import com.example.mybatis.po.BooksExample;
import com.example.mybatis.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

    @Autowired
    BooksService booksService;

    @RequestMapping("/books")
    public String bookList(){

        BooksExample example = new BooksExample();
        example.createCriteria().andIdEqualTo(4);
     return booksService.getList(example).toString();
    }
}
