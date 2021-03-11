package mr223_assign2;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class DateFormat {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year:");
        int Year = input.nextInt();
        System.out.println("Enter a month (number):");
        int Month = input.nextInt();
        System.out.println("Enter a day (number):");
        int Day = input.nextInt();
        //ignore new line character
        input.nextLine();
        System.out.println("Enter a format (b/l/m):");
        String UserAnswer = input.nextLine();
        if (UserAnswer.equals("b")) {
            System.out.printf("%02d/%02d/%04d", Day, Month, Year);

        } else if (UserAnswer.equals("l")) {
            System.out.printf("%02d/%02d/%04d", Month, Day, Year);
        } else {
            System.out.printf("%04d/%02d/%02d", Year, Month, Day);
        }
    }

    public static int Format ( int Year, int Month, int Day,int format){

        return format;
    }
}


