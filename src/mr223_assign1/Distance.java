package mr223_assign1;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        double dis;
        Scanner sc = new Scanner(System.in);
        System.out.println("point x1:");
        x1 =sc.nextInt();
        System.out.println("point y1:");
        y1 =sc.nextInt();
        System.out.println("point x2:");
        x2 =sc.nextInt();
        System.out.println("point y2:");
        y2 =sc.nextInt();
        dis = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.printf("distance between"+"("+x1+","+y1+"), "+"("+x2+", "+y2+")===>%.3f\n" , dis);
        sc.close();
    }
}
