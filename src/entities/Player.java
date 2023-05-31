package entities;

import entities.systems.Combat;

public class Player implements Combat {
    private int health;
    private int defense;
    private int strength;

    public Player(int defense, int strength) {
        this.health = 12;
        this.defense = defense;
        this.strength = strength;
    }

    public int getHealth() {
        return this.health;
    }

    @Override
    public int attack() {
        return this.strength;
    }

    @Override
    public void takeDamage(int damage) {
        if(damage > this.defense){
            this.health = this.health - (damage - this.defense);
            System.out.println("Daño recibido: " + (damage - this.defense) + "\nSalud restante: " + this.health);
        } else {
            System.out.println("Daño recibido: 0");
        }
    }
}
