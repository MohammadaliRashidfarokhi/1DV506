package mr223_assign2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int j = 1;
        Scanner input = new Scanner(System.in);
        while  (j>0){
            System.out.println("Give me a number:");
            j = input.nextInt();
            if (j<=0)
                break;
            if (isprime(j)) {
                System.out.println("\"This is a prime number.\"");
            }else {
                System.out.println("\"This is not a prime number.\"");
            }

            }
        System.out.println("Good bye!");

        }
        public  static boolean isprime(int j){
        for (int x =2 ; x<Math.sqrt(j) ; x++){
            if (j%x==0){
                return false;
            }
        }
        return true;
    }
}
