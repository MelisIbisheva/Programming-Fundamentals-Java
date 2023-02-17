package Lab_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenandOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String lineInput = scanner.nextLine();
        int[] numbersArr = Arrays
                .stream(lineInput.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int evenSum=0;
        int oddSum = 0;
        for(int element : numbersArr){
            if(element %2==0){
                evenSum+=element;
            } else {
                oddSum+=element;
            }
        }
        int difference = evenSum - oddSum;
        System.out.println(difference);
    }
}
