package com.rakovets.course.java.core.practice.oop_principles.Battle;

public class Zombie extends Enemy {
    public int life;
    public Zombie(int health) {
        super(health);
    }

    @Override
    void takeDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            this.dead = true;
            if (this.life > 0) {
                this.health = this.maxHealth;
                this.life -= 1;
                this.dead = false;
            }
        }
    }
}
