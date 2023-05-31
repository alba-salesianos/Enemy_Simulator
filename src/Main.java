import entities.Player;
import entities.enemies.type.Zombie;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int option;
        int playerStrength = 0;
        int playerDefense = 0;
        int turns = 0;
        Random random = new Random();

        System.out.println("¡Te damos la bienvenida a Minecraft! \n¿Qué arma quieres usar?");
        System.out.println("1.Ninguna \n2.Espada de madera \n3.Espada de hierro \n4.Espada de diamante");
        option = keyboard.nextInt();

        switch (option) {
            case 1:
                playerStrength = 0;
                break;

            case 2:
                playerStrength = 2;
                break;

            case 3:
                playerStrength = 3;
                break;


            case 4:
                playerStrength = 5;
                break;

            default:
                System.out.println("Esa no es una opción. Ahora te quedas sin arma.");

        }

        System.out.println("¿Qué armadura quieres usar?");
        System.out.println("1. Ninguna \n2.De cuero \n3.De hierro \n4.De diamante");
        option = keyboard.nextInt();

        switch (option) {
            case 1:
                playerDefense = 0;
                break;

            case 2:
                playerDefense = 1;
                break;

            case 3:
                playerDefense = 2;
                break;


            case 4:
                playerDefense = 3;
                break;

            default:
                System.out.println("Esa no es una opción. Ahora te quedas sin armadura.");

        }

        Player newPlayer = new Player(playerDefense,playerStrength);

        Zombie newZombie = new Zombie(10);



        System.out.println("¡Empieza el combate!");
        while (newPlayer.getHealth() > 0 && newZombie.getHealth() > 0){
            System.out.println("¡Jugador ataca!");
            newZombie.takeDamage(newPlayer.attack());

            if(random.nextInt(2) == 0){
                newZombie.move();
            } else {
                newPlayer.takeDamage(newZombie.attack());
            }
            turns++;
        }

        String winner;

        if(newPlayer.getHealth() == 0){
            winner = "Zombie";
        } else {
            winner = "Jugador";
        }

        System.out.println("Combate finalizado. \nVictoria de " + winner + "\nTurnos completados: " + turns);







    }
}