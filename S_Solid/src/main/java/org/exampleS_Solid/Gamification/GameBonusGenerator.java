package org.exampleS_Solid.Gamification;
import static org.exampleS_Solid.Gamification.PlayerType.*;

public class GameBonusGenerator {
    public double generatePoints(Player player) {

        final var playerType = player.getPlayerType();

        if (MASTER.equals(playerType)) {
            return silverBonus(player);
        }

        if (FIGHTER.equals(playerType) || CHALLENGER.equals(playerType)) {
            return bronzeBonus(player);
        }

        throw new RuntimeException("Invalid player");
    }

    private double bronzeBonus(Player player) {
        final var score = player.getScore();

        if (score > 10000.0) {
            return score * 0.8;
        } else {
            return score * 0.9;
        }
    }

    private double silverBonus(Player player) {
        final var score = player.getScore();

        if (score > 7000.0) {
            return score * 0.75;
        } else {
            return score * 0.85;
        }
    }

}

