package Lab_Methods;

import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int result = calculateArea(width,length);

        System.out.println(result);


    }

    public static int calculateArea(int width, int length){
        return width *length;
    }
}
