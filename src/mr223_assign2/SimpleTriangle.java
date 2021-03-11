package mr223_assign2;

import java.util.Scanner;

public class SimpleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int positiveNumber = sc.nextInt();
        if(positiveNumber<=0) {
            System.out.println("\"Invalid Number\"");

        }
        for (int i = positiveNumber; i >0 ; i--) {
            for (int g = 0; g < positiveNumber - i; g++) {
                System.out.print(" ");

            }
            for (int s = 0; s < i; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}