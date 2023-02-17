package mid_exam;
import java.util.Scanner;


public class zad2_2 {

    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String inputNames = scanner.nextLine();
            String [] arrNames = inputNames.split(", ");
            String inputLine = scanner.nextLine();
            int blackCount = 0;
            int lostToCount= 0;
            while (!inputLine.equals("Report")) {
                String[] commandArr = inputLine.split(" ");
                //swap 1 3
                String command = commandArr[0];


                switch (command) {
                    case "Blacklist":
                        boolean checkForName = false;
                        int indexChange =0;
                        for(int i=0;i< arrNames.length;i++){
                            if(arrNames[i].equals(commandArr[1])){
                                checkForName = true;
                                indexChange = i;
                                break;
                            }
                        }
                        if(checkForName){
                            arrNames[indexChange] = "Blacklisted";
                            blackCount++;
                            System.out.println(commandArr[1]+" was blacklisted.");
                        }else{
                            System.out.println(commandArr[1]+" was not found.");
                        }

                        break;


                    case "Error":
                        int errorIndex = Integer.parseInt(commandArr[1]);
                        if(errorIndex >= 0 && errorIndex <arrNames.length){
                            if(!arrNames[errorIndex].equals("Blacklisted") && !arrNames[errorIndex].equals("Lost")){
                                System.out.println(arrNames[errorIndex]+" was lost due to an error.");
                                arrNames[errorIndex] = "Lost";
                                lostToCount++;
                            }
                        }
                        break;


                    case "Change":
                        int changeIndex = Integer.parseInt(commandArr[1]);
                        String newName = commandArr[2];
                        if(changeIndex >= 0 && changeIndex <arrNames.length){
                            System.out.println(arrNames[changeIndex]+" changed his username to "+ newName+".");
                            arrNames[changeIndex] = newName;
                        }
                        break;
                }

                inputLine = scanner.nextLine();
            }
            System.out.println("Blacklisted names: "+blackCount);
            System.out.println("Lost names: "+lostToCount);
            System.out.println(String.join(" ",arrNames));
        }
    }


}
