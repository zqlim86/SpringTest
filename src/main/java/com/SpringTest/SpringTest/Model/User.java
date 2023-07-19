package com.SpringTest.SpringTest.Model;

import jakarta.persistence.*;

@Entity
@Table(name="user_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="userid")
    private long userid;

    @Column(name="user_name")
    private String user_name;

    @Column(name="user_age")
    private int user_age;

    @Column(name="user_gender")
    private String user_gender;

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getUser_age() {
        return user_age;
    }

    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }
}

