package com.wanghan.demo.api;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



@Component
@Configuration
@ConfigurationProperties(prefix="app")
public class BlogProperties {


    private String oracle;

    private Mysql mysql;

    private Redis redis;

    public Redis getRedis() {
        return redis;
    }

    public void setRedis(Redis redis) {
        this.redis = redis;
    }

    public Mysql getMysql() {
        return mysql;
    }

    public void setMysql(Mysql mysql) {
        this.mysql = mysql;
    }

    public String getOracle() {
        return oracle;
    }

    public void setOracle(String oracle) {
        this.oracle = oracle;
        System.out.println(this.oracle);
    }


    public static class Mysql{
        private String name;

        public void setName(String name) {
            this.name = name;

            System.out.println(this.name);
        }

        public String getName() {
            return name;
        }
    }

    public static class Redis{
        private String name;

        public void setName(String name) {
            this.name = name;

            System.out.println(this.name);
        }

        public String getName() {
            return name;
        }
    }

    // 省略getter和setter


}
