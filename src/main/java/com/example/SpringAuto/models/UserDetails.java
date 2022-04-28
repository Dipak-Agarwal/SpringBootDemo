package com.example.SpringAuto.models;

public class UserDetails {

    private String name;
    private int salary;

    public UserDetails(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

}
