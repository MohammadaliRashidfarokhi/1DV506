package mr223_assign1;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Price");
        double price = input.nextDouble();
        System.out.println("Amount paid:");
        double paid = input.nextDouble();
        double change = paid - price;
        int c = (int) Math.round(change);
        System.out.println("Change: "+c);
        int kr1000 = c / 1000;
        System.out.println("1000 kr bills: "+ kr1000);
        c = c - (kr1000 * 1000);
        int kr500 = c / 500;
        System.out.println("500 kr bills: "+kr500);
        c = c - (kr500 * 500);
        int kr200 = c / 200;
        System.out.println("200 kr bills: "+  kr200);
        c = c -(kr200*200);
        int kr100 = c / 100;
        System.out.println("100 kr bills: "+  kr100);
        c = c - (kr100 * 100);
        int kr50 = c / 50;
        System.out.println("50 kr bills: "+ kr50);
        c = c - (kr50 * 50);
        int kr20= c / 20;
        System.out.println("20 kr bills: "+  kr20);
        c = c - (kr20 * 20);
        int kr10 = c / 10;
        System.out.println("10 kr bills: "+  kr10);
        c = c - (kr10 * 10);
        int kr5 = c / 5;
        System.out.println("5 kr bills: "+  kr5);
        c = c - (kr5 * 5);
        int kr2 = c / 2;
        System.out.println("2 kr bills: "+  kr2);
        c = c - (kr2 * 2);
        int kr1 = c / 1;
        System.out.println("1 kr bills: "+  kr1);
        input.close();


    }
}
