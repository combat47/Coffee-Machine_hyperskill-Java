package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private int water;
    private int milk;
    private int coffeeBeans;
    private int money;
    private int disposableCups;

    public CoffeeMachine(int water, int milk, int coffeeBeans, int money, int disposableCups) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.money = money;
        this.disposableCups = disposableCups;
    }

    public void printStatus() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk ");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    public void buy(int coffeeType) {
        int waterNeeded;
        int milkNeeded = 0;
        int coffeeBeansNeeded;
        int cost;

        switch (coffeeType) {
            case 1 -> {
                waterNeeded = 250;
                coffeeBeansNeeded = 16;
                cost = 4;
            }
            case 2 -> {
                waterNeeded = 350;
                milkNeeded = 75;
                coffeeBeansNeeded = 20;
                cost = 7;
            }
            case 3 -> {
                waterNeeded = 200;
                milkNeeded = 100;
                coffeeBeansNeeded = 12;
                cost = 6;
            }
            default -> {
                System.out.println("Invalid coffee type.");
                return;
            }
        }
        if (water < waterNeeded) {
            System.out.println("Sorry, not enough water!");
            return;
        }

        if (milk < milkNeeded) {
            System.out.println("Sorry, not enough milk!");
            return;
        }

        if (coffeeBeans < coffeeBeansNeeded) {
            System.out.println("Sorry, not enough coffee beans!");
            return;
        }

        if (disposableCups < 1) {
            System.out.println("Sorry, not enough disposable cups!");
            return;
        }

        System.out.println("I have enough resources, making you a coffee!");
        water -= waterNeeded;
        milk -= milkNeeded;
        coffeeBeans -= coffeeBeansNeeded;
        money += cost;
        disposableCups--;
    }

    public void fill(int water, int milk, int coffeeBeans, int disposableCups) {
        this.water += water;
        this.milk += milk;
        this.coffeeBeans += coffeeBeans;
        this.disposableCups += disposableCups;
    }

    public void take() {
        System.out.println("I gave you $" + money);
        this.money = 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CoffeeMachine coffeeMachine = new CoffeeMachine(400, 540, 120, 550, 9);

        while (true) {
            System.out.print("Write action (buy, fill, take, remaining, exit): ");
            String action = scanner.nextLine();

            switch (action) {
                case "buy" -> {
                    System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    if (scanner.hasNextInt()) {
                        int coffeeType = scanner.nextInt();
                        coffeeMachine.buy(coffeeType);
                    }
                }
                case "fill" -> {
                    System.out.print("Write how many ml of water you want to add:");
                    int addedWater = scanner.nextInt();
                    System.out.print("Write how many ml of milk you want to add:");
                    int addedMilk = scanner.nextInt();
                    System.out.print("Write how many grams of coffee beans you want to add:");
                    int addedCoffeeBeans = scanner.nextInt();
                    System.out.print("Write how many disposable cups you want to add:");
                    int addedCups = scanner.nextInt();
                    coffeeMachine.fill(addedWater, addedMilk, addedCoffeeBeans, addedCups);
                }
                case "take" -> coffeeMachine.take();
                case "remaining" -> coffeeMachine.printStatus();
                case "exit" -> {
                    return;
                }
                default -> System.out.println("Invalid action.");
            }
        }
    }
}
