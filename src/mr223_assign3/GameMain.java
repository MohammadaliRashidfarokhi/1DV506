package mr223_assign3;

import java.util.Arrays;
import java.util.List;

public class GameMain {
    public static void main(String[] args) {
        List<Weapon> weapons = Arrays.asList(
                new Weapon(2, "Steel Sallad", 2),
                new Weapon(6, "Shutgun", 7)
        );

        Hero LordGurkan = new Hero("LordGurkan", 5, 5, 30, weapons);
        Enemy PrincePurjoTries = new Enemy("PrincePurjoTries", 5, 5, 30);
        System.out.println(LordGurkan.toString());
        System.out.println(PrincePurjoTries.toString());

        int roundCount = 1;

        while( LordGurkan.getAli() > 0 && PrincePurjoTries.getAli() > 0 ){
            System.out.println("Round " + roundCount);
            handleAttackToEnemy(LordGurkan, PrincePurjoTries);
            handleAttackToHero(PrincePurjoTries, LordGurkan);
            roundCount++;

        }

    }

    private static void handleAttackToEnemy(Hero attacker, Enemy defender) {
        if( attacker.calAttackPower() >  defender.callDefendingPower() ){
            defender.decreaseAli(attacker.callDamage());
            System.out.println(String.format("%s gives %s a powerful blow!", attacker.getName(), defender.getName()));
            if( defender.getAli() <= 0 ){
                System.out.println(defender.getName() + " is defeated!");
            }else{
                System.out.println(defender.getName() + " is still alive!");
            }
        }else{
            System.out.println(String.format("%s gives his all, but %s dodges!", attacker.getName(), defender.getName()));
        }
    }

    private static void handleAttackToHero( Enemy PrincePurjoTries, Hero LordGurkan) {
        if( PrincePurjoTries.calAttackPower() >  LordGurkan.callDefendingPower() ){
            LordGurkan.decreaseAli(PrincePurjoTries.callDamage());
            System.out.println(String.format("%s gives %s a powerful blow!",
                    PrincePurjoTries.getName(), LordGurkan.getName()));
            if( LordGurkan.getAli() <= 0 ){
                System.out.println(LordGurkan.getName() + " is defeated!");
            }else{
                System.out.println(LordGurkan.getName() + " is still alive!");
            }
        }else{
            System.out.println(String.format("%s gives his all, but %s dodges!", PrincePurjoTries.getName(), LordGurkan.getName()));
        }
    }
}
