package com.example.controller;


import com.atguigu.hello.service.HelloService;
import com.example.db.DbConfig;
import com.example.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1 {
    @Autowired
    HelloService helloService;
    @RequestMapping("/hello")
    public String getMapper(){
        return  helloService.sayHello("张三");

    }
    @Autowired
    DbService dbService;
    @RequestMapping("/ck")
    public String getDBconnect(){
        DbConfig dbConfig=dbService.checkConnect();
        return  dbConfig.toString();

    }
}
