package com.kenny;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player player = new Player(100, "Jack", 80);
        Monster monster = new Monster(1000, "Imp", 10);
        saveObject(player);
        saveObject(monster);
        System.out.println("Loading\t" + loadObject().toString());
        System.out.println("Loading\t" + loadObject().toString());
    }

    private static void saveObject(ISaveable object){
        System.out.println("Saving\t" + object.save().get(0).toString());
    }

    @SuppressWarnings("unchecked")
    private static ISaveable loadObject (){
        Scanner scanner = new Scanner(System.in);
        ISaveable object;
        System.out.println("What should be loaded, choose 1 for player and 2 for monster");
        switch (scanner.nextInt()) {
            case 1:
                scanner.nextLine();
                object = new Player();
                object.read(readPlayerValues(), 0);
                return object;
            case 2:
                scanner.nextLine();
                object = new Monster();
                object.read(readMonsterValues(), 0);
                return object;
            default:
                scanner.nextLine();
                System.out.println("Invalid choice");
        }
        return null;
    }

    private static ArrayList<Player> readPlayerValues() {
        ArrayList<Player> values = new ArrayList<Player>();
        Scanner scanner = new Scanner(System.in);
        String name;
        int level, healthPoints;

        System.out.println("Enter player health points");
        healthPoints = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter player name");
        name = scanner.nextLine();
        System.out.println("Enter player level");
        level = scanner.nextInt();
        scanner.nextLine();
        values.add(new Player(healthPoints,name,level));
        return values;
    }

    private static ArrayList<Monster> readMonsterValues() {
        ArrayList<Monster> values = new ArrayList<Monster>();
        Scanner scanner = new Scanner(System.in);
        String monsterType;
        int damage, healthPoints;

        System.out.println("Enter monster health points");
        healthPoints = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter monster type");
        monsterType = scanner.nextLine();
        System.out.println("Enter monster damage");
        damage = scanner.nextInt();
        scanner.nextLine();
        values.add(new Monster(healthPoints,monsterType,damage));
        return values;
    }
}
