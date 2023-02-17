package ExerciseBasicSyntax;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";
        for (int i = username.length()-1; i >=0 ; i--) {
            char symbol = username.charAt(i);
            password+= symbol;

        }
        int number=0;
        String enteredPassword = scanner.nextLine();
        while (!enteredPassword.equals(password)){
            number++;
            if(number==4){
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.printf("Incorrect password. Try again."+System.lineSeparator());
            enteredPassword=scanner.nextLine();

        }
        if (enteredPassword.equals(password)) {

            System.out.printf("User %s logged in.", username);
        }


    }
}
