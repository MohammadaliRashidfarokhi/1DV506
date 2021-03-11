package mr223_assign1;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a temperature in Fahrenheit:");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit-32)*(5.0/9.0);
        System.out.println("Corresponding temperature in Celsius:");
        System.out.println(celsius);
        sc.close();



    }
}
