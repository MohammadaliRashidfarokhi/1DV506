package mr223_assign3;

import java.util.Random;

public class Weapon {
    private int Ability;
    private String name;
    private Random rnd= new Random();
    private int Size;

    public Weapon(int Ability, String name, int Size) {
        this.Ability = Ability;
        this.name = name;
        this.Size = Size;
    }

    public int calDamage(){
        int Total = 0;
        for( int i = 0; i < Ability; i++ ){
            Total+= rnd.nextInt(6) + 1;
        }

        Size--;
        return Total;
    }

    public int getCapacity() {
        return Size;
    }

    public int getAbility() {
        return Ability;
    }
}

