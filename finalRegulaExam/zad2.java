package finalRegulaExam;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String regex = "(!)(?<comand>[A-Z][a-z]{2,})(!:)(?<niz>\\[[A-Za-z]{8,}\\])";


        Matcher matcher =null;
        for (int i = 1; i <=count ; i++) {
            String niz = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            matcher = pattern.matcher(niz);
            if(matcher.matches()){
                String command = matcher.group("comand");
                String allCommand = command + ": ";
                //all.append(allCommand);
                String str = matcher.group("niz");
                String allAski = "";
                StringBuilder all = new StringBuilder();
                all.append(allCommand);
                for (int broi = 1; broi <str.length()-1 ; broi++) {
                    char symbol = str.charAt(broi);
                    int asci = symbol;
                    all.append(asci + " ");


                }
                System.out.println(all);
                matcher=null;
                allAski="";
                all.replace(0,all.length()-1, "");

            }else {
                System.out.println("The message is invalid");
            }
        }


    }
}
