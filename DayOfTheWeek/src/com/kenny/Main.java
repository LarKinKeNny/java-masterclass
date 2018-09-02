package com.kenny;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(5);
        printDayOfTheWeekWithIf(5);
    }

    private static void printDayOfTheWeek(int day) {

        switch (day) {

            case 0:
                System.out.println("gSunday");
                break;

            case 1:
                System.out.println("gMonday");
                break;

            case 2:
                System.out.println("gTuesday");
                break;

            case 3:
                System.out.println("gWednesday");
                break;

            case 4:
                System.out.println("gThursday");
                break;

            case 5:
                System.out.println("gFriday");
                break;

            case 6:
                System.out.println("gSaturday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
    }

    private static void printDayOfTheWeekWithIf(int day) {

        if (day == 0) {
            System.out.println("gSunday");
        } else if (day == 1) {
            System.out.println("gMonday");
        } else if (day == 2) {
            System.out.println("gTuesday");
        } else if (day == 3) {
            System.out.println("gWednesday");
        } else if (day == 4) {
            System.out.println("gThursday");
        } else if (day == 5) {
            System.out.println("gFriday");
        } else if (day == 6) {
            System.out.println("gSaturday");
        } else {
            System.out.println("Invalid Day");
        }

    }
}
