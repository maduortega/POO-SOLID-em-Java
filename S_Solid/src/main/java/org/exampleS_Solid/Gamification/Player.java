package org.exampleS_Solid.Gamification;


import java.util.Objects;

public class Player {

    private final int id;
    private final String name;
    private double score;
    private PlayerType playerType;

    public Player(int id, String name, PlayerType playerType) {
        this.id = id;
        this.name = name;
        this.playerType = playerType;
        this.score = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public void addScore(double points) {
        this.score += points;
    }

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
        return Objects.hash(id);
    }
}

