package final_exam_1;

import java.util.Locale;
import java.util.Scanner;

public class first_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String activationKey = scanner.nextLine();
        String inputLine = scanner.nextLine();

        while (!inputLine.equals("Generate")){
            String [] token = inputLine.split(">>>");
            String command = token[0];
            int startIndex = 0;
            int endIndex = 0;
            switch (command){
                case "Contains":
                    String substring = token[1];
                    if(activationKey.contains(substring)){
                        System.out.printf("%s contains %s" + System.lineSeparator(),activationKey,substring);
                    }else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperOrLower = token[1];
                    startIndex =Integer.parseInt(token[2]);
                    endIndex = Integer.parseInt(token[3]);
                    String subs = activationKey.substring(startIndex,endIndex);
                    if(upperOrLower.equals("Upper")){
                        activationKey = activationKey.replace(subs, subs.toUpperCase());

                    }else {
                        activationKey = activationKey.replace(subs, subs.toLowerCase());

                    }
                    System.out.println(activationKey);
                    break;
                case "Slice":
                    startIndex =Integer.parseInt(token[1]);
                    endIndex = Integer.parseInt(token[2]);
                    String subs2 = activationKey.substring(startIndex,endIndex);
                    activationKey= activationKey.replace(subs2, "");
                    System.out.println(activationKey);
                    break;
            }


            inputLine = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s%n", activationKey);
    }
}
