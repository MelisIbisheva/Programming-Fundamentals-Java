package LabTextProcessing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String stringToRemove = scanner.nextLine();
        String text = scanner.nextLine();

        int index = text.indexOf(stringToRemove);

        while (index!=-1){
            text=text.replace(stringToRemove,"");
            index=text.indexOf(stringToRemove);
        }

        System.out.println(text);
    }
}
