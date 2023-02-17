package mid_exam;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int student = Integer.parseInt(scanner.nextLine());
        double pricePackageFloor = Double.parseDouble(scanner.nextLine());
        double priceOneEgg = Double.parseDouble(scanner.nextLine());
        double priseOneApron = Double.parseDouble(scanner.nextLine());

        double allPriceApron =(priseOneApron* (student + Math.ceil(0.20*student)));
        double allPriceEgg = ((priceOneEgg*10)*(student));
        int freeFloor=0;
        if(student>=5){
            freeFloor = student/5;
        }else {
            freeFloor=0;
        }
        double allPriceFloor= pricePackageFloor*(student-freeFloor);

        double allBudget = allPriceApron + allPriceEgg + allPriceFloor;

        if(allBudget<=budget){
            System.out.printf("Items purchased for %.2f$.",allBudget);
        }else {
            System.out.printf("%.2f$ more needed.", allBudget-budget);
        }



    }
}
