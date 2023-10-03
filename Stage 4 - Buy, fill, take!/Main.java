package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waterMl = 400;
        int milkMl = 540;
        int coffeeG = 120;
        int disposableCups = 9;
        int money = 550;
        System.out.printf("""
                The coffee machine has:
                %d ml of water
                %d ml of milk
                %d g of coffee beans
                %d disposable cups
                $%d of money
                """,waterMl, milkMl, coffeeG, disposableCups, money);

            System.out.println("\nWrite action (buy, fill, take):");
            String input = scanner.nextLine();
        if (input.equals("buy")) {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
            int num = scanner.nextInt();
            switch (num) {
                case 1 -> {
                    waterMl -= 250;
                    coffeeG -= 16;
                    money += 4;
                    disposableCups -= 1;
                    System.out.printf("""
                            The coffee machine has:
                            %d ml of water
                            %d ml of milk
                            %d g of coffee beans
                            %d disposable cups
                            $%d of money
                            """, waterMl, milkMl, coffeeG, disposableCups, money);
                }
                case 2 -> {
                    waterMl -= 350;
                    milkMl -= 75;
                    coffeeG -= 20;
                    money += 7;
                    disposableCups -= 1;
                    System.out.printf("""
                            The coffee machine has:
                            %d ml of water
                            %d ml of milk
                            %d g of coffee beans
                            %d disposable cups
                            $%d of money
                            """, waterMl, milkMl, coffeeG, disposableCups, money);
                }
                case 3 -> {
                    waterMl -= 200;
                    milkMl -= 100;
                    coffeeG -= 12;
                    money += 6;
                    disposableCups -= 1;
                    System.out.printf("""
                            The coffee machine has:
                            %d ml of water
                            %d ml of milk
                            %d g of coffee beans
                            %d disposable cups
                            $%d of money
                            """, waterMl, milkMl, coffeeG, disposableCups, money);
                }
            }
        }
        if (input.equals("fill")) {
            System.out.println("Write how many ml of water you want to add:");
            int fillWater = scanner.nextInt();
            System.out.println("Write how many ml of milk you want to add: ");
            int fillMilk = scanner.nextInt();
            System.out.println("Write how many grams of coffee beans you want to add: ");
            int fillCoffeeBeans = scanner.nextInt();
            System.out.println("Write how many disposable cups you want to add: ");
            int fillDisposableCups = scanner.nextInt();
            waterMl += fillWater;
            milkMl += fillMilk;
            coffeeG += fillCoffeeBeans;
            disposableCups += fillDisposableCups;
            System.out.printf("""
                    The coffee machine has:
                    %d ml of water
                    %d ml of milk
                    %d g of coffee beans
                    %d disposable cups
                    $%d of money
                    """, waterMl, milkMl, coffeeG, disposableCups, money);
        }
        if (input.equals("take")) {
            System.out.printf("I gave you $%d%n%n", money);
            money -= money;
            System.out.printf("""
                    The coffee machine has:
                    %d ml of water
                    %d ml of milk
                    %d g of coffee beans
                    %d disposable cups
                    $%d of money
                    """, waterMl, milkMl, coffeeG, disposableCups, money);
        }
    }
}
