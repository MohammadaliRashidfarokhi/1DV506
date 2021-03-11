package mr223_assign3;

import java.util.List;
import java.util.Random;

public class Hero {
    private String name;
    private int Attacks;
    private int retaliate;
    private int times = 6;
    private int Ali;
    private List<Weapon> armory;
    private Random rnd = new Random();

    public Hero(String name, int Attack, int retaliate, int Ali, List<Weapon> armory) {
        this.name = name;
        this.Attacks= Attack;
        this.retaliate = retaliate;
        this.Ali = Ali;
        this.armory = armory;
    }


    public int calAttackPower(){
        return calPower(Attacks);
    }

    public int callDefendingPower(){
        return calPower(Attacks);
    }

    private int calPower( int numberOfDice ){
        int Total = 0;
        for( int i = 0; i < numberOfDice; i++ ){
            Total += rnd.nextInt(numberOfDice) + 1;
        }

        return Total;
    }

    public int callDamage(){
        Weapon Gun = getWeapon();
        if(Gun == null ){
            return Gun.calDamage();
        }
        return new Random().nextInt(3) + 2;
    }

    public Weapon getWeapon(){
        for( int i = 0; i < armory.size(); i++ ){
            if( armory.get(i).getCapacity() > 1 ){
                return armory.get(i);
            }
        }

        return null;
    }

    public int getAli(){
        return Ali;
    }

    public void decreaseAli( int damage ){
        Ali-= damage;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s has %d XP and %s weapons to fight with", name, Ali, armory.size());
    }
}
