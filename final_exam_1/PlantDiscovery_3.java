package final_exam_1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Map<String, Integer> plantsRarityMap = new LinkedHashMap<>();
        Map<String, Double> rateMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] token = scanner.nextLine().split("<->");
            String plants = token[0];
            int rarity = Integer.parseInt(token[1]);
            rateMap.put(plants, 0.0);

            //plantsRarityMap.putIfAbsent(plants,0);
            plantsRarityMap.put(plants, rarity);
        }

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Exhibition")){
            String[] tokens = inputLine.split("[: -]+");
            String command = tokens[0];
            String plant = tokens[1];


            if(!plantsRarityMap.containsKey(plant)){
                System.out.println("error");
            }else {
                switch (command){
                    case "Rate":
                        double value = Double.parseDouble(tokens[2]);
                        if(rateMap.get(plant)==0){
                            rateMap.put(plant,value);
                        }else {
                            double newRate = (rateMap.get(plant)+value)/2;
                            rateMap.put(plant, newRate);
                        }
                        break;
                    case "Update":
                       int  rarity = Integer.parseInt(tokens[2]);
                       plantsRarityMap.put(plant, rarity);
                        break;
                    case "Reset":
                        rateMap.put(plant, 0.0);
                        break;
                }
            }


            inputLine = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entry : plantsRarityMap.entrySet()) {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",entry.getKey(), entry.getValue(), rateMap.get(entry.getKey()));
        }

    }
}
