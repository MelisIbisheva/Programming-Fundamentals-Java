package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String lineInput = scanner.nextLine();
         while (!lineInput.equals("End")){
            if(lineInput.contains("Add")){
                int addNumber = Integer.parseInt(lineInput.split("\\s+")[1]);
                numbersList.add(addNumber);
            } else if (lineInput.contains("Insert")) {
                int insertNumber = Integer.parseInt(lineInput.split("\\s+")[1]);
                int indexInsert = Integer.parseInt(lineInput.split("\\s+")[2]);
                if(invalidIndex(indexInsert,numbersList)){
                    numbersList.add(indexInsert,insertNumber);
                }else {
                    System.out.println("Invalid index");
                }

            } else if (lineInput.contains("Remove")) {
                int removeIndex = Integer.parseInt(lineInput.split("\\s+")[1]);
                if(invalidIndex(removeIndex,numbersList)){
                    numbersList.remove(removeIndex);
                }else {
                    System.out.println("Invalid index");
                }

                
            } else if (lineInput.contains("Shift left")) {
                int count = Integer.parseInt(lineInput.split("\\s+")[2]);
                for (int i = 1; i <=count ; i++) {
                    int firstElement = numbersList.get(0);
                    numbersList.remove(0);
                    numbersList.add(firstElement);
                }
                
            } else if (lineInput.contains("Shift right")) {
                int count = Integer.parseInt(lineInput.split("\\s+")[2]);
                for (int i = 1; i <=count ; i++) {
                    int lastElement = numbersList.get(numbersList.size()-1);
                    numbersList.remove(numbersList.size()-1);
                    numbersList.add(0,lastElement);
                }
            }


            lineInput=scanner.nextLine();
        }
        for(int number:numbersList){
            System.out.print(number + " ");
        }
    }

    public static boolean invalidIndex(int index, List<Integer> numbers){
        return index>=0 && index<=numbers.size()-1;
    }
}
