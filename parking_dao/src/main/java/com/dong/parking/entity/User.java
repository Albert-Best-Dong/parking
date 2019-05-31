package com.dong.parking.entity;

import java.util.Date;

public class User {
    private String sn;
    private String name;
    private String password;
    private String gender;
    private int age;
    private Date birthday;
    private String email;
    private String phone;

    public User(String sn, String name, String password, String gender, int age, Date birthday, String email, String phone) {
        this.sn = sn;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.birthday = birthday;
        this.email = email;
        this.phone = phone;
    }

    public User() {

    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
