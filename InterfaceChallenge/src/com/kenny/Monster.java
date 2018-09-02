package com.kenny;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private int healthPoints;
    private String monsterType;
    private int damage;

    public Monster() {
    }

    public Monster(int healthPoints, String monsterType, int damage) {
        this.healthPoints = healthPoints;
        this.monsterType = monsterType;
        this.damage = damage;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String getMonsterType() {
        return monsterType;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return ("Health Point: " + healthPoints + "\t Monster Type: " + monsterType + "\tDamage: " + damage);
    }

    @Override
    public List save() {
        List<Monster> monsterList = new ArrayList<Monster>();
        monsterList.add(new Monster(this.healthPoints,this.monsterType,this.damage));
        return monsterList;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void read(List list, int index) {
        List<Monster> monsterList = new ArrayList<Monster>(list);
        if(monsterList.size() > 0){
            this.healthPoints = monsterList.get(index).getHealthPoints();
            this.monsterType = monsterList.get(index).getMonsterType();
            this.damage = monsterList.get(index).getDamage();
        }
    }
}
