package com.example.db;

import org.springframework.boot.context.properties.ConfigurationProperties;
//模拟配置数据库连接
@ConfigurationProperties("user.db")
public class DbConfig {

    private String name;
    private String password;
    private String host;
    private String database;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    @Override
    public String toString() {
        return "DbConfig{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", host='" + host + '\'' +
                ", database='" + database + '\'' +
                '}';
    }
}
