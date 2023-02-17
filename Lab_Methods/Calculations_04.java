package Lab_Methods;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String commandInput = scanner.nextLine();
        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());


        switch (commandInput){
            case "add":
                addNumbers(firstNum,secondNum);

                break;
            case "multiply":
                multiplyNumbers(firstNum,secondNum);

                break;
            case "subtract":
                subtractNumbers(firstNum,secondNum);

                break;
            case "divide":
                divideNumbers(firstNum,secondNum);

                break;

        }

    }

    public static void addNumbers(double firsNumber, double secondNumber){
        double result = firsNumber+secondNumber;
        System.out.printf("%.0f", result);
    }

    public static void multiplyNumbers(double firsNumber, double secondNumber){
        double result = firsNumber*secondNumber;
        System.out.printf("%.0f", result);
    }

    public static void subtractNumbers(double firsNumber, double secondNumber){
        double result = firsNumber-secondNumber;
        System.out.printf("%.0f", result);
    }

    public static void divideNumbers(double firsNumber, double secondNumber){
        double result = firsNumber/secondNumber;
        System.out.printf("%.0f", result);
    }


}
