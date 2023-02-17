package exam_preparation;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] numberArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")){
            if(command.contains("swap")){
                int firstIndex = Integer.parseInt(command.split(" ")[1]);
                int secondIndex = Integer.parseInt(command.split(" ")[2]);
                int firstElement = numberArr[firstIndex];
                int secondElement=numberArr[secondIndex];
                numberArr[firstIndex]=secondElement;
                numberArr[secondIndex]= firstElement;

            } else if (command.contains("multiply")) {
                int first=Integer.parseInt(command.split(" ")[1]);
                int second = Integer.parseInt(command.split(" ")[2]);
                int firstElement = numberArr[first];
                int secondElement = numberArr[second];
                numberArr[first]= firstElement*secondElement;
                
            } else if (command.contains("decrease")) {
                for (int i = 0; i < numberArr.length ; i++) {
                    numberArr[i]= numberArr[i]-1;
                }
                
            }


            command=scanner.nextLine();
        }
        for (int i = 0; i < numberArr.length ; i++) {
            if(i== numberArr.length-1){
                System.out.print(numberArr[i]);
            }else {
                System.out.print(numberArr[i]+ ", ");
            }

        }

    }
}
