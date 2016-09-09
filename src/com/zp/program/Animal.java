package com.zp.program;

/**
 * Created by Captain_Z on 2016/9/9.
 */
public class Animal implements Talk {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println("animal's name:" + getName() + "\n\r" + "animal's age:" + getAge());
    }
}
