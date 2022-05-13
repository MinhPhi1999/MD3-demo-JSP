package com.example.demojsp;

public class Students {
    int id;
    String name;
    int Age;

    public Students() {
    }

    public Students(int id, String name, int age) {
        this.id = id;
        this.name = name;
        Age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
