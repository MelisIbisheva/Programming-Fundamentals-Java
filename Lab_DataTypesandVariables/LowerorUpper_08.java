package Lab_DataTypesandVariables;

import java.util.Scanner;

public class LowerorUpper_08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);
        if(Character.isUpperCase(symbol)){
            System.out.printf("upper-case");
        }else {
            System.out.printf("lower-case");
        }
    }
}
