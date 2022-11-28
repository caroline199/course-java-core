package com.rakovets.course.java.core.practice.oop_principles.Battle;

public abstract class Hero {
    public String name;
    public int health;
    public boolean dead;

    public Hero(String name) {
        this.name = name;
    }

    void attackEnemy(Enemy enemy) {
        enemy.takeDamage(100);
        System.out.println("Hero attacks the enemy!");
    }

    void takeDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            this.dead = true;
        }
    }

    public String getName() {
        return this.name;
    }
}
