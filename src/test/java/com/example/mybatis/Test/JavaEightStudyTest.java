package com.example.mybatis.Test;

import com.example.mybatis.po.Books;
import com.example.mybatis.service.BooksService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author kmz
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class JavaEightStudyTest {

    @Autowired
    BooksService booksService;

    @Test
    public void ListToMap() {

        System.out.println(booksService.getAll().stream().collect(Collectors.toMap(Books::getName, Books::getPrice)));
        System.out.println(booksService.getAll().stream().map(Books::getName).collect(Collectors.toList()));
        System.out.println(booksService.getAll().stream().collect(Collectors.toMap(Books::getName, Books::getDescription)));

    }
    @Test
    public void test(){

    }


}
