import entities.enemies.type.Zombie;

public class Main {
    public static void main(String[] args) {
        Zombie zombie1 = new Zombie(12);

        System.out.println(zombie1.attack());
    }
}