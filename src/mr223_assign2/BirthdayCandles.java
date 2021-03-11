package mr223_assign2;

import java.util.Scanner;

public class BirthdayCandles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        int Candles=0 ; int Boxes = 0;
        int Sum = 0;
        for (year =1; year<=100; year++){
            if (Candles<year){
                if (year- Candles<24)
                    Boxes =1;
                else {
                    if ((year - Candles) % 24 == 0)
                        Boxes = (year - Candles) / 24;
                    else
                        Boxes = (year - Candles) / 24 + 1;
                }
                Candles = Candles + Boxes*24-year;
                }else
            {Boxes=0;
            Candles= Candles-year;

            }
            if (Boxes!=0){
                System.out.println("Before Birthday"+ year+":buy"+Boxes+"box(es)");
            }Sum += Boxes;
        }
        System.out.println("Total number of boxes:"+""+Sum+""+ Candles);
        input.close();


    }
}
