package entities.enemies;

public abstract class Mob {
    protected int health;

    public Mob(int health) {
        this.health = health;
    }

    public abstract void move();
}
