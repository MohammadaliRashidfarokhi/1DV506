package mr223_assign1;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.print(" First number: ");
            int a = in.nextInt();
        System.out.print(" Second number: ");
            int b = in.nextInt();
        System.out.print(" Third number: ");
            int c = in.nextInt();
            int min, max, med;
            if (a > b) {
                if (a > c) {
                    max = a;
                    if (b > c) {
                        med = b;
                        min = c;
                    } else {
                        med = c;
                        min = b;
                    }
                } else {
                    med = a;
                    if (b > c) {
                        max = b;
                        min = c;
                    } else {
                        max = c;
                        min = b;
                    }
                }
            } else {
                if (b > c) {
                    max = b;
                    if (a > c) {
                        med = a;
                        min = c;
                    } else {
                        med = c;
                        min = a;
                    }
                } else {
                    med = b;
                    max = c;
                    min = a;
                }
            }
            System.out.print(" sorted numbers : " + min + " " + med + " " + max);
        }
    }

