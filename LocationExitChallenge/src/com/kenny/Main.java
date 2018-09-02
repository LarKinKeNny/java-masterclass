package com.kenny;
//Course code used for challenge
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);

        int loc = 1;
        while(true) {
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for(String exit: exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();
            String decodedDirection = decodeMyString(scanner.nextLine());

            if(exits.containsKey(decodedDirection)) {
                loc = exits.get(decodedDirection);

            } else {
                System.out.println("You cannot go in that direction");
            }
        }
    }

//Added code for challenge
    private static String decodeMyString(String enteredString){
        String [] userString = enteredString.split(" ");
        String decodedDirection = "";
        for(String direction : userString){
            if(direction.equalsIgnoreCase("North") || direction.equalsIgnoreCase("n") || direction.equalsIgnoreCase("North,")){
                return decodedDirection = "N";
            }else if(direction.equalsIgnoreCase("South") || direction.equalsIgnoreCase("s")|| direction.equalsIgnoreCase("South,")){
                return decodedDirection = "S";
            }else if(direction.equalsIgnoreCase("East") || direction.equalsIgnoreCase("e")|| direction.equalsIgnoreCase("East,")){
                return decodedDirection = "E";
            }else if(direction.equalsIgnoreCase("West") || direction.equalsIgnoreCase("w")|| direction.equalsIgnoreCase("West,")){
                return decodedDirection = "W";
            }else if(direction.equalsIgnoreCase("Quit") || direction.equalsIgnoreCase("q")|| direction.equalsIgnoreCase("Quit,")){
                return decodedDirection = "Q";
            }
        }
        return decodedDirection;
    }
}