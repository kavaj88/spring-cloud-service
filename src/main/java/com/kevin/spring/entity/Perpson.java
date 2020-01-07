package com.kevin.spring.entity;

public class Perpson {

    private String name;

    private String age;

    private Integer sex;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Perpson{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex=" + sex +
                '}';
    }
}
