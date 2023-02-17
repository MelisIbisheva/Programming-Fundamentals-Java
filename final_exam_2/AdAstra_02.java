package final_exam_2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "(#|\\|)(?<food>[A-Za-z\\s]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int totalCalories = 0;
        StringBuilder allFood = new StringBuilder();

        while (matcher.find()){
            String foodName = matcher.group("food");
            String expDate =matcher.group("expirationDate");
            int calories=Integer.parseInt(matcher.group("calories"));
            totalCalories+=calories;
            allFood.append(String.format("Item: %s, Best before: %s, Nutrition: %d"+ System.lineSeparator(), foodName, expDate, calories));
        }

        int days = totalCalories/2000;
        System.out.printf("You have food to last you for: %d days!"+ System.lineSeparator(), days);
        System.out.println(allFood);

    }
}
