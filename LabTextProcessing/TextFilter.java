package LabTextProcessing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] banWards = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for(String item : banWards){
            text = text.replace(item,replaceString("*", item.length()));
        }

        System.out.println(text);
    }

    public static String replaceString(String a, int count){
        String result = "";
        for (int i = 0; i <count; i++) {
            result+= a;
        }
        return result;
    }
}
