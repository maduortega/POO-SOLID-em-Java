package Gamefication;

public class GoldBonus implements BonusCalculator{

    @Override
    public double calculateBonus(Player player) {
        double score = player.getScore();

        if (score > 9000) {
            return score * 0.75;
        } else {
            return score * 0.85;
        }
    }
}
