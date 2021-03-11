package mr223_assign2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DangerousWork {
    public static void main(String[] args) {
        int digit = 0;
        int Highest_Value;
        double existing_Pay;
        Scanner input = new Scanner(System.in);
        DecimalFormat wanted = new DecimalFormat();
        int totalityPay = 1;
        existing_Pay = 0.005;
        System.out.println("How much would you like to earn?");
        Highest_Value = input.nextInt();
        while (Highest_Value > totalityPay) {
            existing_Pay = existing_Pay * 2;
            totalityPay += existing_Pay;
            digit++;
        }
        if (digit > 30) {
            System.out.println("\"you probably won’t survive\n" +
                    "working more than 30 days…\"");
        } else
        {
            System.out.println("You will have your money "+"in"+" "+digit+" "+"days");
        }


    }


}
