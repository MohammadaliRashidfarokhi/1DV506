package mr223_assign1;

import java.util.Scanner;

public class Area {
     static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Radius: ");
        float radius = sc.nextFloat();
        float area = (float) Math.PI * (radius * radius);
        area = (int) (area*10);
        System.out.println("corresponding area is " + area /10);
        sc.close();

    }
}
