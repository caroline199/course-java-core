package com.rakovets.course.java.core.practice.oop_principles.cats;

public class Siamese extends Cat {
    public Siamese(String name) {
        super(name);
    }

    @Override
    public void mew() {
        this.mewText = "Meow";
    }

    @Override
    void mew(Person person) {
        mewText = "meow for User";
        person.changeHappiness(-3);
    }

    @Override
    public void purr() {
        this.mewText = "Murr!";
    }

    @Override
    void purr(Person person) {
        purrText = "Murr for User";
        person.changeHappiness(3);
    }
}

