package com.example.mybatis.controller;

import com.example.mybatis.po.BooksExample;
import com.example.mybatis.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BooksController {

    @Autowired
    BooksService booksService;

    @RequestMapping("/books")
    public String bookList() {

        BooksExample example = new BooksExample();
        example.createCriteria().andIdEqualTo(4);
        return booksService.getList(example).toString();
    }

    @RequestMapping(value = "/hello/{name}/{price}", method = RequestMethod.GET)
    public String returnString(@PathVariable String name, @PathVariable Double price) {
        String message = "name =" + name + ",price = " + price;
        return message;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getParam(@RequestParam("description") String description,@RequestParam("name") String name){
        String message = name+" say:"+description;
        return message;
    }

}
