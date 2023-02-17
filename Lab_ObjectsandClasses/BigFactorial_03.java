package Lab_ObjectsandClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        BigInteger result = new BigInteger(String.valueOf(1));
        for (int i = n; i >=1 ; i--) {
            result = result.multiply(BigInteger.valueOf(i));

        }
        System.out.println(result);
    }
}
