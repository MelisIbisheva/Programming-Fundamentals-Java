package exam_preparation;

import java.util.Scanner;

public class GuineaPig_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double foodQuantityKg = Double.parseDouble(scanner.nextLine());
        double hayQuantityKg = Double.parseDouble(scanner.nextLine());
        double coverQuantityKg = Double.parseDouble(scanner.nextLine());
        double weightKg = Double.parseDouble(scanner.nextLine());

        double foodQuantityGr = foodQuantityKg*1000;
        double hayQuantityGr= hayQuantityKg*1000;
        double coverQuantityGg = coverQuantityKg*1000;
        double weightGr = weightKg*1000;
        boolean isNotEnough = false;
        for (int day = 1; day <=30 ; day++) {
            foodQuantityGr-=300;
            if(day %2==0){
                double currentHay = foodQuantityGr*0.05;
                hayQuantityGr = hayQuantityGr-currentHay;
            }
            if(day%3==0){
                double currentCover = weightGr/3;
                coverQuantityGg = coverQuantityGg-currentCover;
            }
            if(foodQuantityGr<=0 || hayQuantityGr<=0 || coverQuantityGg<=0){
                isNotEnough=true;
                break;
            }
        }

        if(isNotEnough){
            System.out.println("Merry must go to the pet store!");
        }else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodQuantityGr/1000, hayQuantityGr/1000,coverQuantityGg/1000);

        }
    }
}
