package com.hsj.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/*
 *@ClassName Person
 *@Description
 *@Author hsj
 *Date 2020/2/2 23:16
 */
public class Person {
    private String username;
    private String email;
    private Date userDate;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getUserDate() {
        return userDate;
    }

    public void setUserDate(Date userDate) {
        this.userDate = userDate;
    }
}
