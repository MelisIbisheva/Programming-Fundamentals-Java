package mid_exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> phones = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")){
            if(command.contains("Add")){
                String addPhone = command.split(" - ")[1];
                if(!phones.contains(addPhone)){
                    phones.add(addPhone);
                }
                
            } else if (command.contains("Remove")) {
                String removePhone = command.split(" - ")[1];
                if(phones.contains(removePhone)){
                    phones.remove(removePhone);
                }
                
            } else if (command.contains("Bonus phone ")) {
                String allComand = command.split(" - ")[1];
                String oldPhone = allComand.split(":")[0];
                String newPhone = allComand.split(":")[1];
                if(phones.contains(oldPhone)){
                    int index = phones.indexOf(oldPhone);
                    phones.add(index+1, newPhone);
                }
                
            } else if (command.contains("Last")) {
                String lastPhone = command.split(" - ")[1];
                if(phones.contains(lastPhone)){
                    phones.remove(lastPhone);
                    phones.add(lastPhone);
                }
            }


            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", phones));
    }
}
