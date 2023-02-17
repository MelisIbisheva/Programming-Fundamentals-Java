
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String spell = scanner.nextLine(); //парола за модификация
        String command = scanner.nextLine(); //команда или "Done"
        while (!command.equals("Abracadabra")) {
            if (command.equals("Abjuration")) {
                spell = spell.toUpperCase();
                System.out.println(spell);
            } else if (command.equals("Necromancy")) {
                spell = spell.toLowerCase();
                System.out.println(spell);
            } else if (command.contains("Illusion")) {
                int index = Integer.parseInt(command.split("\\s+")[1]);
                if(spell.length()<=index){
                    System.out.println("The spell was too weak.");
                }else{
                    char letter = command.split("\\s+")[2].charAt(0); // 5
                    spell = spell.substring(0, index) + letter + spell.substring(index + 1);
                    System.out.println("Done!");
                }

            } else if (command.contains("Divination")) {
                String substring = command.split("\\s+")[1];
                String substitute = command.split("\\s+")[2];
                if (spell.contains(substring)) {
                    spell = spell.replaceAll(substring, substitute);
                    System.out.println(spell);
                }
            } else if (command.contains("Alteration")) {
                String substring = command.split("\\s+")[1];
                if (spell.contains(substring)) {
                    spell=spell.replaceAll(substring, "");
                    System.out.println(spell);
                }
            } else {
                System.out.println("The spell did not work!");
            }
            command = scanner.nextLine();
        }
    }
}