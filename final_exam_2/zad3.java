package final_exam_2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int countHerro= Integer.parseInt(scanner.nextLine());
        Map<String,Integer> hpMap = new LinkedHashMap<>();
        Map<String, Integer> mpMap = new LinkedHashMap<>();

        for (int herro = 1; herro <=countHerro ; herro++) {
            String herroInfo = scanner.nextLine();
            String[] heroDate = herroInfo.split("\\s+");
            String name = heroDate[0];
            int hp = Integer.parseInt(heroDate[1]);
            int mp = Integer.parseInt(heroDate[2]);
            if(hp<=100) {
                hpMap.put(name, hp);
            }

            if(mp<=200) {
                mpMap.put(name, mp);
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("End")){
            if(command.contains("CastSpell")){
                String[] date = command.split(" - ");
                String name =date[1];
                int mpNeeded =Integer.parseInt(date[2]);
                String spellName= date[3];
                int currentMp = mpMap.get(name);
                if(currentMp>=mpNeeded){
                    int mpLeft = currentMp - mpNeeded;
                    mpMap.put(name, mpLeft);
                    System.out.printf("%s has successfully cast %s and now has %d MP!"+ System.lineSeparator(), name, spellName, mpLeft);

                }else {
                    System.out.printf("%s does not have enough MP to cast %s!" + System.lineSeparator(), name, spellName);

                }
                
            } else if (command.contains("TakeDamage")) {
                String[] date = command.split(" - ");
                String name = date[1];
                int damage = Integer.parseInt(date[2]);
                String attacker = date[3];
                int currentHP = hpMap.get(name);

                currentHP-=damage;
                if(currentHP>0){
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!"+ System.lineSeparator(), name, damage, attacker,currentHP);
                    hpMap.put(name, currentHP);

                }else {

                    System.out.printf("%s has been killed by %s!"+ System.lineSeparator(), name,attacker);
                    hpMap.remove(name);
                    mpMap.remove(name);
                }
                
            } else if (command.contains("Recharge")) {
                String[] date = command.split(" - ");
                String name = date[1];
                int amount = Integer.parseInt(date[2]);
                int currentMP = mpMap.get(name);
                currentMP += amount;
                if(currentMP>200){
                    currentMP=200;

                }
                System.out.printf("%s recharged for %d MP!" + System.lineSeparator(),name, currentMP-mpMap.get(name));
                mpMap.put(name, currentMP);
                
            } else if (command.contains("Heal")) {
                String[] date = command.split(" - ");
                String name = date[1];
                int amount = Integer.parseInt(date[2]);
                int currentHP = hpMap.get(name);
                currentHP+=amount;
                if(currentHP>100){
                    currentHP=100;

                }
                System.out.printf("%s healed for %d HP!" + System.lineSeparator(), name,currentHP-hpMap.get(name));
                hpMap.put(name, currentHP);
                
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : hpMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println("HP: "+entry.getValue());
            System.out.println("MP: "+mpMap.get(entry.getKey()));
        }


    }
}
