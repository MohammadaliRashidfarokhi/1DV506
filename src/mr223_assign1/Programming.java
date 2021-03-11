package mr223_assign1;
import java.util.Scanner;

public class Programming {
    public static void main(String[] args) {
        int n=3;
        String temp;
        Scanner sc = new Scanner(System.in);
        String titles[] = new String[n];
        // choose three titles in any order
        System.out.println("What is the first language?");
        String a = sc.nextLine();
        System.out.println("And the second?");
        String b = sc.nextLine();
        System.out.println("And the third?");
        String c = sc.nextLine();
        titles[0]= a;
        titles[1]=b;
        titles[2]=c;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n ; j++) {
                if (titles[i].compareTo(titles[j]) > 0) {
                    temp = titles[i];
                    titles[i] = titles[j];
                    titles[j] = temp;
                }
            }
        }
        System.out.print("Alphabetical order is ");
        for(int i = 0; i < n - 1; i++) {
            System.out.print(titles[i] + ", ");
        }
        System.out.print(titles[n-1]);
        sc.close();
        }
    }


