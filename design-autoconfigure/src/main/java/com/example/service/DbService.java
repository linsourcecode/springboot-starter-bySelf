package com.example.service;

import com.example.db.DbConfig;
import org.springframework.beans.factory.annotation.Autowired;

public class DbService {
    @Autowired
    DbConfig dbConfig;

    public DbConfig checkConnect(){

        //返回连接对象
        return dbConfig;
    }
}
