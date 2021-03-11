package mr223_assign1;

import java.util.Scanner;

public class DoctorWho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what year:");
        int digits;
        digits = sc.nextInt();
        if((digits>= 1963) && (digits<1989)) {
            System.out.println("the original series");
        } else if ((digits>= 1989) && (digits<2005)) {
            System.out.println("the series break ");
        } else if ((digits >=2005) &&(digits <= 2019)) {
            System.out.println("modern doctor tv show");
        }
        else if (digits >= 2020) {
            System.out.println("no news on a doctor yet, but hope never dies");
            sc.close();
        }
    }
}
