package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index <numbersArr.length ; index++) {
            int currentNumber = numbersArr[index];
            for (int inIndex = index+1; inIndex < numbersArr.length ; inIndex++) {
                int inNumber = numbersArr[inIndex];
                if(currentNumber + inNumber==magicSum){
                    System.out.println(currentNumber + " " + inNumber);
                }

            }

        }
    }
}
