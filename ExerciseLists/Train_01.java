package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int max = Integer.parseInt(scanner.nextLine());
        String lineInput = scanner.nextLine();
        while (!lineInput.equals("end")){
            if(lineInput.contains("Add")){
                String[] arr=lineInput.split(" ");
                int addElement=Integer.parseInt(arr[1]);
                numbersList.add(addElement);
                lineInput = scanner.nextLine();
            }else {
                int passengers=Integer.parseInt(lineInput);
                for (int i = 0; i <numbersList.size() ; i++) {
                    if(numbersList.get(i)+passengers<=max){
                        int newElements = numbersList.get(i)+passengers;
                        numbersList.set(i,newElements);
                        break;
                    }


                }
                lineInput=scanner.nextLine();
            }
        }
        for(int element:numbersList){
            System.out.print(element + " ");
        }


    }
}
