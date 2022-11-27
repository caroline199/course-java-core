package com.rakovets.course.java.core.practice.oop_principles.Battle;

public class Mag extends Hero {
    public Mag(String name) {
        super(name);
    }

    @Override
    void attackEnemy(Enemy enemy) {
        enemy.takeDamage(102);
        System.out.println("Mag attacks the enemy!");
    }
}
