package mr223_assign2;

import java.util.Scanner;

public class EveryOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First number:");
        int first = sc.nextInt();
        System.out.println("Second number:");
        int second = sc.nextInt();
        for (int i= first; i <= second; i+=2) {
            System.out.print(i + " ");

        }
    }
}
