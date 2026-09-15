package Gamefication;

import static Gamefication.PlayerType.*;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player(1, "Ana", PlayerType.MASTER);
        Player player2 = new Player(2, "John", PlayerType.FIGHTER);
        Player player3 = new Player(3, "Maria", PlayerType.CHALLENGER);
        Player player4 = new Player(4, "Selmininho", PlayerType.MASTER_PLUS);


        // exhibit the initial state
        System.out.println("Initial state of players:");
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println((player4));

        // Adding score
        player1.addScore(7500);
        player2.addScore(6000);
        player3.addScore(6500);
        player4.addScore(10000);

        // exhibit state after alteration
        System.out.println("\nAfter score update:");
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(player4);

        // Calculating bonus
        double masterBonus = player1.calculateBonus();
        double fighterBonus = player2.calculateBonus();
        double challengerBonus = player3.calculateBonus();
        double masterplusBonus = player4.calculateBonus();

        System.out.println("\nBonus points:");
        System.out.println("MASTER player bonus: " + masterBonus);
        System.out.println("FIGHTER player bonus: " + fighterBonus);
        System.out.println("CHALLENGER player bonus: " + challengerBonus);
        System.out.println("MASTER_PLUS player bonus: " + masterplusBonus);
    }
}