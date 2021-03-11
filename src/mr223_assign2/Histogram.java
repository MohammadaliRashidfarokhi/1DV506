package mr223_assign2;

import java.util.Random;

public class Histogram {
    public static void main(String[] args) {
        Random random = new Random();
        int dice1 = 0 , dice2 = 0 , dice3 = 0 , dice4 = 0, dice5 = 0, dice6 = 0;
        int shots;
        for(int i =1; i<=500; i++) {
            shots = random.nextInt(6) +1;
            if (shots == 1) {
                ++dice1;
            }
            if (shots == 2) {
                ++dice2;
            } else if (shots == 3) {
                ++dice3;
            } else if (shots == 4) {
                ++dice4;
            } else if (shots == 5) {
                ++dice5;
            } else {
                ++dice6;
            }
        }
        System.out.println("(One)" + dice1+" "+"*".repeat(dice1));
        System.out.println("");
        System.out.println("(Two)" + dice2+" "+"*".repeat(dice2));
        System.out.println("");
        System.out.println("(Three)" + dice3+" "+"*".repeat(dice3));
        System.out.println("");
        System.out.println("(Four)" + dice4+" "+"*".repeat(dice4));
        System.out.println("");
        System.out.println("(Five)" + dice5+" "+"*".repeat(dice5));
        System.out.println("");
        System.out.println("(Six)" + dice6+" "+"*".repeat(dice6));







            }

        }
