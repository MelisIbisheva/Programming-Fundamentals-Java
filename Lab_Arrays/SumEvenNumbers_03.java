package Lab_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String line = scanner.nextLine();
        int[] numberArr = Arrays
                .stream(line.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum=0;
        for (int i = 0; i <numberArr.length ; i++) {
            if(numberArr[i]%2==0){
                sum+=numberArr[i];
            }

        }
        System.out.println(sum);
    }
}
