package mid_exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> friendsList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        List<String> black = new ArrayList<>();
        List<String> noFound = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("Report")){
            if(command.contains("Blacklist")){
                String name = command.split(" ")[1];
                if(friendsList.contains(name)){
                    black.add(name);
                    int index = friendsList.indexOf(name);
                    String newName = "Blacklisted";
                    friendsList.set(index,newName);
                    System.out.printf("%s was blacklisted."+ System.lineSeparator(), name);
                }else {
                System.out.printf("%s was not found." + System.lineSeparator(),name);
                }
            } else if (command.contains("Error")) {
                int indexError= Integer.parseInt(command.split(" ")[1]);
                if(indexError>=0 && indexError<=friendsList.size()-1){
                    String nameInIndex = friendsList.get(indexError);
                    if(!friendsList.get(indexError).equals("Blacklisted") && !friendsList.get(indexError).equals("Lost")){
                        noFound.add(nameInIndex);
                        String newName = "Lost";
                        friendsList.set(indexError,newName);
                        System.out.printf("%s was lost due to an error."+ System.lineSeparator(),nameInIndex);
                    }
                }

            } else if (command.contains("Change")) {
                int indexToChange = Integer.parseInt(command.split(" ")[1]);
                String nameToChange = command.split(" ")[2];
                if(indexToChange>=0 && indexToChange<=friendsList.size()-1){
                    String currentN = friendsList.get(indexToChange);
                    friendsList.set(indexToChange,nameToChange);
                    System.out.printf("%s changed his username to %s."+ System.lineSeparator(),currentN, nameToChange);
                }
                
            }
            command = scanner.nextLine();
        }
        System.out.printf("Blacklisted names: %d "+System.lineSeparator(), black.size());
        System.out.printf("Lost names: %d"+System.lineSeparator(), noFound.size());
        System.out.println(String.join(" ", friendsList));

    }
}
