package com.example.demo;

import org.apache.ibatis.jdbc.SQL;

public class ExProvide {

    public String getAll(){
        return new SQL(){{
            SELECT("*");
            FROM("tbexample");
        }}.toString();
    }
}
