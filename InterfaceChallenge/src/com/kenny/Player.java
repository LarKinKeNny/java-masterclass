package com.kenny;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private int healthPoints;
    private String name;
    private int level;

    public Player() {
    }

    public Player(int healthPoints, String name, int level) {
        this.healthPoints = healthPoints;
        this.name = name;
        this.level = level;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return ("Health Points:" + healthPoints + "\t Name: " + name + "\t Level: " + level);
    }

    @Override
    public List save() {
        List<Player> playerList = new ArrayList<Player>();
        playerList.add(new Player(this.healthPoints,this.name,this.level));
        return playerList;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void read(List list, int index) {
        List<Player> playerList = new ArrayList<Player>(list);
        if (playerList.size() > 0) {
            this.name = playerList.get(index).getName();
            this.healthPoints = playerList.get(index).getHealthPoints();
            this.level = playerList.get(index).getLevel();
        }

    }

}
