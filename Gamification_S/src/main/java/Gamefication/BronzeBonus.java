package Gamefication;

public class BronzeBonus implements BonusCalculator {

    @Override
    public double calculateBonus(Player player) {
        double score = player.getScore();

        if (score > 5000.0) {
            return score * 0.8;
        } else {
            return score * 0.9;
        }
    }
}
