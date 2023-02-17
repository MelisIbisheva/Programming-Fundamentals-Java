package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String lineInput = scanner.nextLine();
        while (!lineInput.equals("end")){
            String[] arr =lineInput.split(" ");
            String command = arr[0];
            switch (command){
                case "Delete":
                    int deleteElement = Integer.parseInt(arr[1]);
                    numbersList.removeAll(Arrays.asList(deleteElement));
                    break;
                case "Insert":
                    int insertElement= Integer.parseInt(arr[1]);
                    int indexInsert = Integer.parseInt(arr[2]);
                    numbersList.add(indexInsert, insertElement);
                    break;

            }

            lineInput=scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
