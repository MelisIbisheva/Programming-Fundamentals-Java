package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDonGo_09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumRemoved = 0;
        while (numbersList.size()>0){
            int index = Integer.parseInt(scanner.nextLine());
            if(index>=0 && index<=numbersList.size()-1){
                int removedElement = numbersList.get(index);
                sumRemoved+=removedElement;
                numbersList.remove(index);
                modify(numbersList, removedElement);
            } else if (index<0) {
                int firstElement = numbersList.get(0);
                sumRemoved+=firstElement;
                numbersList.remove(0);
                int lastElement = numbersList.get(numbersList.size()-1);
                numbersList.add(0,lastElement);
                modify(numbersList, firstElement);


            } else if (index>numbersList.size()-1) {
                int lastElement = numbersList.get(numbersList.size()-1);
                sumRemoved+=lastElement;
                numbersList.remove(numbersList.size()-1);
                int firstElement = numbersList.get(0);
                numbersList.add(firstElement);
                modify(numbersList, lastElement);


            }
        }
        System.out.println(sumRemoved);
    }

    private static void modify(List<Integer> numbersList, int removedElement) {
        for (int indexList = 0; indexList <= numbersList.size()-1 ; indexList++) {
            int currentNum = numbersList.get(indexList);
            if(currentNum<= removedElement){
                currentNum+= removedElement;
            }else {
                currentNum-= removedElement;
            }
            numbersList.set(indexList,currentNum);
        }
    }
}
