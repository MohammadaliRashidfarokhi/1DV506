package mr223_assign1;
import java.util.Random;
import java.util.Scanner;

public class RandomSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0, n;

        System.out.println("Five random numbers: ");
        for (int i = 0; i < 5; i++){
            n = (int) (Math.random() * 100) + 1;
            System.out.print(n+" ");
            s += n;
        }
        // enter 5 digits then you have the sum of those 5 numbers!
        System.out.println("\nsummation of 5 digits will be: " + s);
        sc.close();
    }

}
