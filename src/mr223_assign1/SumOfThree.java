package mr223_assign1;

import java.util.Scanner;

public class SumOfThree {
    public static void main(String[] args) {
        int Outcome;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number with three digits:");
        System.out.println("First number");
        int Number1= input.nextInt();
        System.out.println("Second number");
        int Number2 = input.nextInt();
        System.out.println("Third number");
        int Number3 = input.nextInt();
        Outcome = (Number1+Number2+Number3);
        System.out.println("The sum of three number is"+"\n"+Outcome);
    }
}
