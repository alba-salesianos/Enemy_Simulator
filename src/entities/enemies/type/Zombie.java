package entities.enemies.type;

import entities.enemies.HostileMob;

public class Zombie extends HostileMob {
    public Zombie(int health) {
        super(health);
        this.strength = 4;
    }
    @Override
    public void move() {
        System.out.println("Se mueve hacia el personaje.");
    }
}
