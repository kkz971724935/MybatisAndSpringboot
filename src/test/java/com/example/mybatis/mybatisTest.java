package com.example.mybatis;

import com.example.mybatis.po.Books;
import com.example.mybatis.po.BooksExample;
import com.example.mybatis.service.BooksService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisApplication.class)
@WebAppConfiguration
public class mybatisTest {

    @Autowired
    private BooksService booksService;

    @Before
    public void init(){
        System.out.println("测试开始");
    }
    @Test
    public void test(){
        BooksExample example = new BooksExample();

        example.createCriteria().andPriceEqualTo(123.0).andIdEqualTo(4);

        List<Books> list1 = new ArrayList<>();
        list1 = booksService.getList(example);
        System.out.println(list1.size());
        System.out.println(list1);

        BooksExample example1 = new BooksExample();

        example1.createCriteria().andIdEqualTo(5);
        System.out.println("example 中的数量:"+example.getOredCriteria().get(0).toString());
    }

    @Test
    public void test2(){
        System.out.println(booksService.getAll().toString());
    }

    @After
    public void after(){
        System.out.println("测试结束");
    }
}
