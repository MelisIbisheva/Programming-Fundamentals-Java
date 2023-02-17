package finalRegulaExam;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String zaklinanie = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Abracadabra")){
            if(command.equals("Abjuration")){
                zaklinanie=zaklinanie.toUpperCase();
                System.out.println(zaklinanie);
                
            } else if (command.equals("Necromancy")) {
                zaklinanie=zaklinanie.toLowerCase();
                System.out.println(zaklinanie);
                
            } else if (command.contains("Illusion")) {
                int index = Integer.parseInt(command.split("\\s+")[1]);
                //String letter = command.split("\\s+")[2];
                char letter = command.split("\\s+")[2].charAt(0);
                //char symbol = letter.charAt(0);
                ;
               if(zaklinanie.length()<=index){
                   System.out.println("The spell was too weak.");

               }else {
                   //char currentLetter = zaklinanie.charAt(index);
                   //zaklinanie=zaklinanie.replace(currentLetter,symbol);
                   //System.out.println("Done!");
                   zaklinanie = zaklinanie.substring(0, index) + letter + zaklinanie.substring(index + 1);
                   System.out.println("Done!");
               }
                
            } else if (command.contains("Divination")) {
                String first = command.split("\\s+")[1];
                String second = command.split("\\s+")[2];
                if(zaklinanie.contains(first)){
                    zaklinanie=zaklinanie.replaceAll(first,second);
                    System.out.println(zaklinanie);
                }
                
            } else if (command.contains("Alteration")) {
                String substring = command.split("\\s+")[1];
                if(zaklinanie.contains(substring)){
                    zaklinanie=zaklinanie.replaceAll(substring,"");
                    System.out.println(zaklinanie);
                }
                
            }else {
                System.out.println("The spell did not work!");
            }


            command=scanner.nextLine();
        }

    }
}
