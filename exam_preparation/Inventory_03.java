package exam_preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> inventoryList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String lineInput = scanner.nextLine();
        while (!lineInput.equals("Craft!")){
            if(lineInput.contains("Collect")){
                String addItem = lineInput.split(" - ")[1];
                if(!inventoryList.contains(addItem)){
                    inventoryList.add(addItem);
                }
                
            } else if (lineInput.contains("Drop")) {
                String dropItem = lineInput.split(" - ")[1];
                if (inventoryList.contains(dropItem)) {
                    inventoryList.remove(dropItem);
                }
                
            } else if (lineInput.contains("Combine Items")) {
                String allItem = lineInput.split(" - ")[1];
                String oldItem = allItem.split(":")[0];
                String newItem = allItem.split(":")[1];
                if(inventoryList.contains(oldItem)){
                    int indexOld = inventoryList.indexOf(oldItem);
                    inventoryList.add(indexOld+1,newItem);
                }
                
            } else if (lineInput.contains("Renew")) {
                String renewItem = lineInput.split(" - ")[1];
                if(inventoryList.contains(renewItem)){
                    inventoryList.remove(renewItem);
                    inventoryList.add(renewItem);
                }
                
            }


            lineInput = scanner.nextLine();
        }
        System.out.println(String.join(", ", inventoryList));
    }
}
