package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static Scanner scanner = new Scanner(System.in);
    public static int[] ingredients = {400, 540, 120, 9, 550};

    public static void main(String[] args) {
        actionChoice();
    }

    public static void ingredientsInfo(int[] ing) {
        System.out.printf("The coffee machine has:\n%d of water\n%d of milk\n%d of coffee beans\n%d of disposable cups\n$%d of money\n\n", ing[0], ing[1], ing[2], ing[3], ing[4]);
    }

    public static void actionChoice() {
        boolean flag = true;
        while (flag) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String choice = scanner.next();
            System.out.println();
            switch (choice) {
                case "buy":
                    buy(ingredients);
                    break;
                case "fill":
                    fill(ingredients);
                    break;
                case "take":
                    take(ingredients);
                    break;
                case "remaining":
                    ingredientsInfo(ingredients);
                    break;
                case "exit":
                    flag = false;
                    break;
            }
        }
    }

    public static void buy(int[] ing) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String choice = scanner.next();
        switch (choice) {
            case "1":
                if (ing[0] < 250) {
                    System.out.println("Sorry, not enough water!");
                } else if (ing[2] < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (ing[3] < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    ing[0] -= 250;
                    ing[2] -= 16;
                    ing[3] -= 1;
                    ing[4] += 4;
                }
                System.out.println();
                break;
            case "2":
                if (ing[0] < 350) {
                    System.out.println("Sorry, not enough water!");
                } else if (ing[1] < 75) {
                    System.out.println("Sorry, not enough milk!");
                } else if (ing[2] < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (ing[3] < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    ing[0] -= 350;
                    ing[1] -= 75;
                    ing[2] -= 20;
                    ing[3] -= 1;
                    ing[4] += 7;
                }
                System.out.println();
                break;
            case "3":
                if (ing[0] < 200) {
                    System.out.println("Sorry, not enough water!");
                } else if (ing[1] < 100) {
                    System.out.println("Sorry, not enough milk!");
                } else if (ing[2] < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else if (ing[3] < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    ing[0] -= 200;
                    ing[1] -= 100;
                    ing[2] -= 12;
                    ing[3] -= 1;
                    ing[4] += 6;
                }
                System.out.println();
                break;
            case "back":
                break;
        }
    }

    public static void fill(int[] ing) {
        System.out.println("Write how many ml of water do you want to add:");
        ing[0] += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        ing[1] += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        ing[2] += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        ing[3] += scanner.nextInt();
        System.out.println();
    }

    public static void take(int[] ing) {
        System.out.println("I gave you $" + ing[4]);
        ing[4] -= ing[4];
        System.out.println();
    }
}
