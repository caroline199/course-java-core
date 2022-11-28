package com.rakovets.course.java.core.practice.oop_principles.Battle;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    void attackEnemy(Enemy enemy) {
        enemy.takeDamage(101);
        System.out.println("Archer attacks the enemy!");
    }
}
