package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static final int water = 200;
    private static final int milk = 50;
    private static final int coffeeBeans = 15;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int mlWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int mlMilk = scanner.nextInt();
        System.out.println("Write how many ml of coffee beans the coffee machine has:");
        int mlCoffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cupsOfCoffee = scanner.nextInt();
        int portionOfWater = mlWater / water;
        int portionOfMilk = mlMilk / milk;
        int portionOfCoffee = mlCoffeeBeans / coffeeBeans;
        int[] coffeeDefault = {portionOfWater, portionOfMilk, portionOfCoffee};

        int min = coffeeDefault[0];
        for (int j : coffeeDefault) {
            if (j < min)
                min = j;
        }
        int possibleMaxAmount = min;
        int additionalCups = possibleMaxAmount - cupsOfCoffee;
        if (additionalCups == 0){
            System.out.println("Yes, I can make that amount of coffee");
        } else if (additionalCups > 0){
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", additionalCups);
        } else {
            System.out.printf("No, I can make only %d cup(s) of coffee", min);
        }
    }
}
