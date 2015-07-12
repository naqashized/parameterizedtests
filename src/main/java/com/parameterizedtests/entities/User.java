package com.parameterizedtests.entities;

/**
 * Created by Techphile on 7/12/2015.
 */
public class User {

    private final String name;
    private final int age;
    private final String address;
    public User(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}