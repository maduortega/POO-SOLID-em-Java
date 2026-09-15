package Gamefication;

// Só põe
import java.util.Objects;

// Colocar construtor e demais, use Alt + Insert

// Ao colocar "Final" o player não aceita mais herança, ou seja, sem extends!
// Você só pode criar um novo tipo de player no Enum
public class Player {

    // Criando atributos
    // O final significa que a aplicação deve obrigatóriamente nascer com esses atributos
    // Ele diz que o id e o nome não vão ser alterados
    private final int id;
    private final String name;
    // double é o float do java
    private double score;
    private PlayerType playerType;

    public Player(int id, String name, PlayerType playerType) {
        this.id = id;
        this.name = name;
        this.playerType = playerType;
        this.score = 0.0;
    }

    // Getters e Setters (no caso só temos getters aqui)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public PlayerType getPlayerType() { return playerType;}

    public void setPlayerType(PlayerType playerType) { this.playerType = playerType; }

    public double getScore() {
        return score;
    }

    // O set só pode ser feito no score, pois não há final, ou seja, o valor pode ser
    // alterado, diferente do id e nome, que são definidos no construtor
    // Nesse caso retiramos o set e mudamos ele para addScore
    public void addScore(double score) {
        if(score<0){
            System.out.println("Score invalido");
            return;
        }
        this.score = score;
    }

    public double calculateBonus() {
        return playerType.getBonusCalculator().calculateBonus(this);}


    // Para criar uma classe com qualidade e encapsulamento é preciso ter o hashcode,
    // private e toString. Obrigatoriamente!
    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", playerType=" + playerType +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, score, playerType);
    }
}
