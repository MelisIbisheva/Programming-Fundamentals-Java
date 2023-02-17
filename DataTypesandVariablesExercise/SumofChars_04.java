package DataTypesandVariablesExercise;

import java.util.Scanner;

public class SumofChars_04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int sum = 0;
        int countSymbol = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=countSymbol ; i++) {
            char value = scanner.nextLine().charAt(0);
            int code = (int) value;
            sum+= code;
            // moje napravo
           // sum += value;



        }
        System.out.printf("The sum equals: %d",sum);

    }
}
