package mr223_assign2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner output = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a word or sentence:");
            String User_Answer = ((output.nextLine())).replaceAll("\\s", "");
            if (User_Answer.equalsIgnoreCase("stop"))
                break;
            if (has_been_occupy(User_Answer)) {
                System.out.println("That was a palindrome.");
            } else {
                System.out.println("That wasn't a palindrome");
            }
        }


    }
    public static boolean has_been_occupy (String line)
    {
        return(line.equals(new StringBuffer(line).reverse().toString()));
    }
}
