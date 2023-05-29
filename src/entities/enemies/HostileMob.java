package entities.enemies;

import entities.systems.Combat;

public abstract class HostileMob extends Mob implements Combat {
    protected int strength;
    public HostileMob(int health) {
        super(health);
    }

    @Override
    public int attack() {
        return this.strength;
    }

    public void takeDamage(int damage) {
        this.health = this.health - damage;
        System.out.println("Daño recibido: " + damage + "\nSalud restante: " + this.health);
    }


}
