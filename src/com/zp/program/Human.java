package com.zp.program;

/**
 * Created by Captain_Z on 2016/9/9.
 */
public class Human extends Animal {
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Human(String name, int age, String country) {
        super(name, age);
        this.country = country;
    }

    @Override
    public void say() {
        System.out.println("human's name:" + getName() + "\n\r" + "human's age:" + getAge() + "\n\r" + "human's country:" + getCountry());
    }
}
