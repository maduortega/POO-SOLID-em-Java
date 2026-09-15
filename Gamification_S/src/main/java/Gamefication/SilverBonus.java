package Gamefication;

public class SilverBonus implements BonusCalculator{

    @Override
    public double calculateBonus(Player player) {
        double score = player.getScore();

        if (score > 7000.0) {
            return score * 0.75;
        } else {
            return score * 0.85;
        }
    }
}
