package finalRegulaExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int allMessage = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        Map<String,Integer> izpateniMap = new LinkedHashMap<>();
        Map<String , Integer> polucheniMap = new LinkedHashMap<>();
        while (!command.equals("Statistics")){
            if(command.contains("Add")){
                String[] date = command.split("=");
                String username = date[1];
                int sent = Integer.parseInt(date[2]);
                int received = Integer.parseInt(date[3]);
                int allm = sent+received;
                if(allm<allMessage){
                    if(!izpateniMap.containsKey(username)){
                        izpateniMap.put(username, sent);
                        polucheniMap.put(username, received);
                    }
                }

                
            } else if (command.contains("Message")) {
                String[] date = command.split("=");
                String sender = date[1];
                String receiver = date[2];
                if(izpateniMap.containsKey(sender) && polucheniMap.containsKey(receiver)){
                    int izprateni = (izpateniMap.get(sender)+1);
                    izpateniMap.put(sender, izprateni);
                    int polucheni = (polucheniMap.get(receiver)+1);
                    polucheniMap.put(receiver, polucheni);
                    if(izpateniMap.get(sender)+polucheniMap.get(sender)>=allMessage){
                        izpateniMap.remove(sender);
                        polucheniMap.remove(sender);
                        System.out.printf("%s reached the capacity!%n", sender);
                    } else if (izpateniMap.get(receiver)+ polucheniMap.get(receiver)>=allMessage) {
                        izpateniMap.remove(receiver);
                        polucheniMap.remove(receiver);
                        System.out.printf("%s reached the capacity!%n", receiver);

                    }
                }

            } else if (command.contains("Empty")) {
                String[] date = command.split("=");
                String username = date[1];
                if(izpateniMap.containsKey(username)){
                    izpateniMap.remove(username);
                    polucheniMap.remove(username);
                } else if (username.equals("All")) {
                    izpateniMap.clear();
                    polucheniMap.clear();
                    
                }

            }


            command= scanner.nextLine();
        }

        int broi = izpateniMap.size();
        System.out.printf("Users count: %d" + System.lineSeparator(), broi);
        for (Map.Entry<String, Integer> entry : izpateniMap.entrySet()) {
            int numberOfMessage = entry.getValue() + polucheniMap.get(entry.getKey());
            System.out.printf("%s - %d" + System.lineSeparator(), entry.getKey(), numberOfMessage);

        }


    }
}
