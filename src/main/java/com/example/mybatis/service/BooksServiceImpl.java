package com.example.mybatis.service;

import com.example.mybatis.dao.BooksMapper;
import com.example.mybatis.po.Books;
import com.example.mybatis.po.BooksExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {
    @Autowired
    BooksMapper booksMapper;
    @Override
    public List<Books> getList(BooksExample example) {
        return booksMapper.selectByExample(example);
    }

    @Override
    public List<Books> getAll() {
        return booksMapper.selectAll();
    }
}
