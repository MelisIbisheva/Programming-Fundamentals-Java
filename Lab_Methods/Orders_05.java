package Lab_Methods;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (product){
            case "coffee":
                coffeeMethod(quantity);

                break;
            case "water":
                waterMethod(quantity);

                break;
            case "coke":
                cokeMethod(quantity);

                break;
            case "snacks":
                snacksMethod(quantity);

                break;

        }
    }

    public static void coffeeMethod(int quantity){
        double result = quantity * 1.50;
        System.out.printf("%.2f",result);
    }

    public static void waterMethod(int quantity){
        double result = quantity * 1.00;
        System.out.printf("%.2f",result);
    }

    public static void cokeMethod(int quantity){
        double result = quantity * 1.40;
        System.out.printf("%.2f",result);
    }

    public static void snacksMethod(int quantity){
        double result = quantity * 2.00;
        System.out.printf("%.2f",result);
    }
}
