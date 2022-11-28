package com.rakovets.course.java.core.practice.oop_principles.cats;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }

    @Override
    public void mew() {
        this.mewText = "Miaw!";
    }

    @Override
    void mew(Person person) {
        mewText = "mew for User";
        person.changeHappiness(-2);
    }

    @Override
    public void purr() {
        this.purrText = "Purr";
    }

    @Override
    void purr(Person person) {
        purrText = "purr for User";
        person.changeHappiness(2);
    }
}
