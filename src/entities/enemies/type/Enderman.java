package entities.enemies.type;

import entities.enemies.HostileMob;

public class Enderman extends HostileMob {
    public Enderman(int health) {
        super(health);
        this.strength = 6;
    }
    @Override
    public void move() {
        System.out.println("Se teletransporta detrás.");
    }
}
