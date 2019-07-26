package com.example.mybatis.service;

import com.example.mybatis.dao.BooksMapper;
import com.example.mybatis.po.Books;
import com.example.mybatis.po.BooksExample;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Service
public class BooksServiceImpl implements BooksService {
    @Autowired
    BooksMapper booksMapper;

    private final ListeningExecutorService backgroundRefreshPools = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(3));

    private final LoadingCache<String,Date> rateCache = CacheBuilder.newBuilder().maximumSize(2)
            .refreshAfterWrite(10,TimeUnit.SECONDS)
            .build(new CacheLoader<String, Date>() {
                @Override
                public Date load(String s) throws Exception {
                    return new Date();
                }

            });
    @Override
    public List<Books> getList(BooksExample example) {
        return booksMapper.selectByExample(example);
    }

    @Override
    public List<Books> getAll() {
        return booksMapper.selectAll();
    }
}
