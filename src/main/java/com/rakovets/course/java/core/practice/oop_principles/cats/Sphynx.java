package com.rakovets.course.java.core.practice.oop_principles.cats;

public class Sphynx extends Cat {
    public Sphynx(String name) {
        super(name);
    }

    @Override
    public void mew() {
        this.mewText = "Miu!";
    }

    @Override
    void mew(Person person) {
        mewText = "Miu for User";
        person.changeHappiness(-4);
    }

    @Override
    public void purr() {
        this.purrText = "Purrr";
    }

    @Override
    void purr(Person person) {
        purrText = "Purrr for User";
        person.changeHappiness(4);
    }
}
