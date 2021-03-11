package mr223_assign1;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Covert The number of Seconds into Hours,minutes and seconds
        System.out.println("Give a number for seconds:");
        int seconds = input.nextInt();
        int t1 = seconds % 60;
        int t2 = seconds / 60;
        int t3 = t2 % 60;
        t2 = t2 / 60;
        System.out.println(t2 +" hours, " + t3 + " minutes and " + t1 + "seconds.");
        System.out.println("\n");
        input.close();

    }
}
