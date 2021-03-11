package mr223_assign3;

import java.util.Random;

public class Enemy {
    private String name;
    private int Attacks;
    private int retaliate;
    private int times = 5;
    private int Ali;
    private Random rnd = new Random();

    public Enemy(String name, int Attacks, int retaliate, int Ali) {
        this.name = name;
        this.Attacks = Attacks;
        this.retaliate= retaliate;
        this.Ali = Ali;
    }

    public int calAttackPower(){
        return calPower(Attacks);
    }

    public int callDefendingPower(){
        return calPower(Attacks);
    }

    public int callDamage(){
        return new Random().nextInt(14) + 1;
    }

    private int calPower( int Chance ){
        int Total = 0;
        for( int i = 0; i < Chance; i++ ){
            Total += rnd.nextInt(Chance) + 1;
        }

        return Total;
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
        return String.format("%s has %d XP and uses his fists to fight with.", name, Ali);
    }
}


