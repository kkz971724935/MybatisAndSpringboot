package com.example.mybatis.dao;

import com.example.mybatis.po.Books;
import com.example.mybatis.po.BooksExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BooksMapper {
    long countByExample(BooksExample example);

    int deleteByExample(BooksExample example);

    int insert(Books record);

    int insertSelective(Books record);

    List<Books> selectByExample(BooksExample example);

    int updateByExampleSelective(@Param("record") Books record, @Param("example") BooksExample example);

    int updateByExampleWithBLOBs(@Param("record") Books record, @Param("example") BooksExample example);

    int updateByExample(@Param("record") Books record, @Param("example") BooksExample example);

    List<Books> selectAll();
}