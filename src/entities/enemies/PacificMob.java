package entities.enemies;

import entities.systems.Damage;

public abstract class PacificMob  extends Mob implements Damage {
    public PacificMob(int health) {
        super(health);
    }

    public void takeDamage(int damage) {
        this.health = this.health - damage;
        System.out.println("Daño recibido: " + damage + "\nSalud restante: " + this.health);
    }
}
