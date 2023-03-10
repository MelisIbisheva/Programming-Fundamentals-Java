package final_exam_2;

import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String password = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Done")){
            if(command.equals("TakeOdd")){
                String newPassword = oddIndexConcatenates(password);
                password = newPassword;
                System.out.println(newPassword);
                
            }else if(command.contains("Cut")){
                int index = Integer.parseInt(command.split("\\s+")[1]);
                int length = Integer.parseInt(command.split("\\s+")[2]);
                String substringToRemove =password.substring(index, index+length);
                password = password.replaceFirst(substringToRemove,"");
                System.out.println(password);

            } else if (command.contains("Substitute")) {
                String substring=command.split("\\s+")[1];
                String substitute = command.split("\\s")[2];
                if(password.contains(substring)){
                    password = password.replaceAll(substring, substitute);
                    System.out.println(password);

                }else {
                    System.out.println("Nothing to replace!");
                }

            }

            command=scanner.nextLine();

        }
        System.out.printf("Your password is: %s", password);
    }

    private static String oddIndexConcatenates(String password) {
        StringBuilder newPassword = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            if(i%2!=0){
                char currentSymbol = password.charAt(i);
                newPassword.append(currentSymbol);
            }
        }
        return newPassword.toString();
    }
}
