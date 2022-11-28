package com.rakovets.course.java.core.practice.oop_principles.cats;

public class Person {
    private int happiness;

    public Person(int happiness) {
        this.happiness = happiness;
    }

    void changeHappiness(int percentHappiness) {
        this.happiness = percentHappiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getHappiness() {
        return this.happiness;
    }
}
