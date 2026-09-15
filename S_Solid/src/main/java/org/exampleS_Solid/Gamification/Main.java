package org.exampleS_Solid.Gamification;

public class Main {
    public static void main(String[] args) {
        // Creating players using the enum PlayerType
        Player player1 = new Player(1, "Ana", PlayerType.MASTER);
        Player player2 = new Player(2, "John", PlayerType.FIGHTER);
        Player player3 = new Player(3, "Maria", PlayerType.CHALLENGER);

        GameBonusGenerator bonusGenerator = new GameBonusGenerator();

        System.out.println("Initial state of players:");
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);

        // Adding score
        player1.addScore(8000);
        player2.addScore(12000);
        player3.addScore(9000);

        System.out.println("\nAfter score update:");
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);

        // Calculating bonus
        double masterBonus = bonusGenerator.generatePoints(player1);
        double fighterBonus = bonusGenerator.generatePoints(player2);
        double challengerBonus = bonusGenerator.generatePoints(player3);

        System.out.println("\nBonus points:");
        System.out.println("MASTER player bonus: " + masterBonus);
        System.out.println("FIGHTER player bonus: " + fighterBonus);
        System.out.println("CHALLENGER player bonus: " + challengerBonus);
    }




    }

