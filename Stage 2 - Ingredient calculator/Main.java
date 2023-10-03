package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static int twoHundredo = 200;
    private static int fifty = 50;
    private static int fifteen = 15;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need: ");
        int cupsOfCoffee = scanner.nextInt();
        System.out.printf("For %d cups of coffee you will need:%n", cupsOfCoffee);
        System.out.printf("%d ml of water%n", (cupsOfCoffee * twoHundredo));
        System.out.printf("%d ml of milk%n", (cupsOfCoffee * fifty));
        System.out.printf("%d g of coffee beans%n", (cupsOfCoffee * fifteen));
    }
}
