package mr223_assign1;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Temperature;
        System.out.println("Temperature (C):");
        Temperature = sc.nextDouble();
        System.out.println("Wind Speed:");
        double WindSpeed = sc.nextDouble();
        WindSpeed = WindSpeed * 3.6;
        double V = Math.pow(WindSpeed , 0.16);
        double T = 13.12 + (0.6215*Temperature) - (11.37*V)+ (0.3965*Temperature*V);
        T = Math.round(T*10);
        T = T/10;
        System.out.println("Wind Chill Temperature (C)" + T);
        sc.close();
    }
}
