package com.rakovets.course.java.core.practice.oop_principles.Battle;


interface Mortal {
    boolean isAlive();
}

public class Enemy implements Mortal {
    public int health;
    public int maxHealth;
    public boolean dead;

    public Enemy(int health) {
        this.health = health;
        this.maxHealth = health;
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    void takeDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            this.dead = true;
        }
    }
}
