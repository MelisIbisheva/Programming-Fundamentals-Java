package Lab_Methods;

import java.util.Scanner;

public class GreaterofTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String typeData = scanner.nextLine();

        switch (typeData){
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstNum,secondNum));
                break;
            case "char":
                char first = scanner.nextLine().charAt(0);
                char second= scanner.nextLine().charAt(0);
                System.out.println(getMax(first,second));
                break;
            case "string":
                String firstS = scanner.nextLine();
                String secondS= scanner.nextLine();
                System.out.println(getMax(firstS,secondS));
                break;
        }


    }

    public  static int getMax(int firstNumber, int secondNumber){
        if(firstNumber>secondNumber){
            return firstNumber;
        }else {
            return secondNumber;
        }


    }

    public static char getMax(char first, char second){
        if(first>second){
            return first;
        }else {
            return second;
        }
    }

    public static String getMax(String firstS, String secondS){
        if(firstS.compareTo(secondS)>0){
            return firstS;
        }else {
            return secondS;
        }
    }
}
