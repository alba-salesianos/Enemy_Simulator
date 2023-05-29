package entities;

public class Player {
    private int health;
    private int defense;
    private int strength;

    public Player(int defense, int strength) {
        this.health = 12;
        this.defense = defense;
        this.strength = strength;
    }
}
