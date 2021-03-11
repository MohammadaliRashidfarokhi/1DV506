package mr223_assign2;

import java.util.Random;
import java.util.Scanner;

public class Ants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random Ran = new Random();
        System.out.println("Ants");

        System.out.println("=====");

        int Summation = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Number of Steps in simulation " + (i + 1) + ": ");

            int assign = 0, counts = 0;
            int[][] initial = new int[8][8];

            Random rnd = new Random();
            int x = rnd.nextInt(8);

            int y = rnd.nextInt(8);

            initial[x][y] = 1;

            while (assign != 63) {
                int step = rnd.nextInt(4);


                //UP
                if
                (step == 0) {
                    if
                    (y < 7)
                        y += 1;
                    if
                    (initial[x][y] != 1) {
                        assign++;
                    }
                    initial[x][y] = 1;
                }
                //DOWN
                if
                (step == 1) {
                    if
                    (y > 0)
                        y -= 1;
                    if
                    (initial[x][y] != 1) {
                        assign++;
                    }
                    initial[x][y] = 1;
                }
                //LEFT
                if
                (step == 2) {
                    if
                    (x > 0)
                        x -= 1;
                    if
                    (initial[x][y] != 1) {
                        assign++;
                    }
                    initial[x][y] = 1;
                }
                //RIGHT
                if
                (step == 3) {
                    if
                    (x < 7)
                        x += 1;
                    if
                    (initial[x][y] != 1) {
                        assign++;
                    }
                    initial[x][y] = 1;
                }
                counts++;
            }
            Summation= Summation + counts;
            System.out.print(counts + "\n");

        }
        double average = Summation / 10;

        System.out.println("Average amount of steps: " + average);
    }
}