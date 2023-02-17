package Lab_Arrays;

import java.util.Scanner;

public class ReverseArrayofStrings_04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String lineInput = scanner.nextLine();
        String[] stringArr = lineInput.split(" ");
        for (int i = stringArr.length-1; i>=0 ; i--) {
            System.out.printf("%s ", stringArr[i]);


        }
    }
}
