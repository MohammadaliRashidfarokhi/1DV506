package mr223_assign1;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ready to play ? (Y/N)");
        int userTotal=0, botTotal=0;
        String userAnswer = sc.nextLine();
        if(userAnswer.equals("y") || userAnswer.equals("Y")) {
            int userDice = (int) (Math.random() * 6) + 1;
            System.out.println("You rolled: "+userDice);
            userTotal=userTotal+userDice;
            System.out.println("Would you like to roll again? (Y/N)");
            String rollAgain = sc.nextLine();
            if(rollAgain.equals("y") || rollAgain.equals("Y")) {
                int userDice2 = (int) (Math.random() * 6) + 1;
                userTotal = userTotal + userDice2;
                System.out.println("You rolled "+userDice2+" and in total you have "+userTotal);
            }
            int botDice = (int) (Math.random() * 6) + 1;
            botTotal = botTotal + botDice;
            System.out.println("The computer rolled "+botDice);
            if(botDice <= 4) {
                int botDice2 = (int) (Math.random() * 6) + 1;
                botTotal = botTotal + botDice2;
                System.out.println("The computer rolls again and gets "+botDice2+" in total "+botTotal);
            }
            if (botTotal>9 && userTotal>9){
            System.out.println("you are fat");}
            if(botTotal<=9 && userTotal>9) {
                System.out.println("Computer won!");
                System.out.println("you are fat");
            } else if(botTotal>9 && userTotal<=9) {
                System.out.println("You won!");
                System.out.println("Computer is fat");
            } else if(botTotal==userTotal){
                System.out.println("Draw!");
            } else if(userTotal<=9 && botTotal<=9 && userTotal<botTotal){
                System.out.println("Computer won!");
            } else if(userTotal<=9 && botTotal<=9 && userTotal>botTotal) {
                System.out.println("You won");
            }
            }
        sc.close();
        }


    }
