package com.example.mybatis.Test;

import com.example.mybatis.controller.BooksController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class booksTest {

    @Autowired
    public MockMvc mockMvc;

    @Test
    public void books() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/hello/十万个为什么/1231"))
        .andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string("sss"));
    }
}
