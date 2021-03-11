package mr223_assign2;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int largest =0;
        int Second_largest = 0, temp, digits;
        System.out.println("Provide 10 integers:");
        digits = 10;
        for(int k = 0 ; k<digits;k++){
            if(k==0) {
                largest = sc.nextInt();
            }else {
                temp = sc.nextInt();
                if (temp > largest) {
                    Second_largest = largest;
                    largest = temp;
                } else {
                    if (temp > Second_largest) {
                        Second_largest = temp;

                    }
                }
            }



            }
        System.out.println("The second largest is:"+" "+ Second_largest);
        }



    }

