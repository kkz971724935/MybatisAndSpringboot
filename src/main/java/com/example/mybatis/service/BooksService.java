package com.example.mybatis.service;

import com.example.mybatis.po.Books;
import com.example.mybatis.po.BooksExample;

import java.util.List;


public interface BooksService {

    List<Books> getList(BooksExample example);

    List<Books> getAll();
}
