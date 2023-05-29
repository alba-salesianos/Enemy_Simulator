package entities.enemies.type;

import entities.enemies.PacificMob;

public class Sheep extends PacificMob {
    public Sheep(int health) {
        super(health);
    }

    @Override
    public void move() {
        System.out.println("Se mueve por el campo.");
    }
}
