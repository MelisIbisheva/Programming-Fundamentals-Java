package Lab_ObjectsandClasses;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");

        Random rnd = new Random();
        for (int i = 0; i < words.length ; i++) {
            int indexX = rnd.nextInt(words.length);
            String oldIndex= words[indexX];
            int indexY = rnd.nextInt(words.length);
            words[indexX]=words[indexY];
            words[indexY]=oldIndex;
        }
        System.out.print(String.join(System.lineSeparator(),words));
    }
}
