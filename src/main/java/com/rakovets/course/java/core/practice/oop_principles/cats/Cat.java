package com.rakovets.course.java.core.practice.oop_principles.cats;

public class Cat {
    private String name;
    public String mewText;
    public String purrText;

    public Cat(String name) {
        this.name = name;
    }

    void mew() {
        mewText = "mew";
    }

    void mew(Person person) {
        mewText = "mew for User";
        person.changeHappiness(-1);
    }

    void purr() {
        purrText = "purr";
    }

    void purr(Person person) {
        purrText = "purr for User";
        person.changeHappiness(1);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}

