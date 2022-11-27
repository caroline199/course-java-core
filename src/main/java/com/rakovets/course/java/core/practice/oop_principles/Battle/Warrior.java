package com.rakovets.course.java.core.practice.oop_principles.Battle;

import com.rakovets.course.java.core.practice.oop_principles.cats.Cat;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    void attackEnemy(Enemy enemy) {
        enemy.takeDamage(103);
        System.out.println("Warrior attacks the enemy!");
    }
}

