package mr223_assign2;

import java.util.Scanner;

public class Diamonds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\"Give a positive number:\"");
            int Num = sc.nextInt();

            if (Num < 0) {
                break;
            }
            for (int B = 1; B <= Num; B++) {
                for ( int F = B; F < Num; F++) {
                    System.out.print(" ");
                }
                for (int X = 1; X < (B * 2); X++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            for (int B = Num - 1; B >= 1; B--) {
                for (int F = Num; F > B; F--) {
                    System.out.print(" ");
                }
                for (int X = 1; X < (B * 2); X++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}



