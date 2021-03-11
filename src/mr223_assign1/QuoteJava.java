package mr223_assign1;

import java.util.Scanner;

public class QuoteJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String quote = sc.nextLine();
        System.out.println("You said: \"" + quote+"\"" );
        sc.close();
    }

}
