package Gamefication;

// Eu crio constantes com o Enum, isso evita que eu crie outros tipos de players
// que não sejam esses
public enum PlayerType {
    MASTER(new SilverBonus()),
    FIGHTER(new BronzeBonus()),
    CHALLENGER(new BronzeBonus()),
    MASTER_PLUS(new GoldBonus());

    // Sem essa atribuição, não conseguimos calcular o tipo de bônus
    private final BonusCalculator bonusCalculator;

    PlayerType(BonusCalculator bonusCalculator) {this.bonusCalculator = bonusCalculator;}

    public BonusCalculator getBonusStrategy() { return bonusCalculator; }

    public BonusCalculator getBonusCalculator() {return bonusCalculator;}
}