package mr223_assign2;

import java.util.Scanner;

public class CalcNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true) {
            System.out.println("Give me a number:");
            int num = sc.nextInt();
            if(num==0) {
                break;
            } else {
                sum += num;
            }
        }
        System.out.println("The sum is: "+sum);

        }

    }

