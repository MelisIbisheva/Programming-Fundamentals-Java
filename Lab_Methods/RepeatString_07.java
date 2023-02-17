package Lab_Methods;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String result = conText(n, inputString);
        System.out.println(result);

    }

    public static String conText(int n, String string) {
        String result = "";
        for (int i = 0; i < n; i++) {

            result += string;

        }

        return result;
    }

}
