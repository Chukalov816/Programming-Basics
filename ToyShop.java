import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        int toys = puzzles+dolls+teddyBears+minions+trucks;

        double income = puzzles*2.60 +dolls*3 +teddyBears*4.10+minions*8.20 + trucks*2.0;

       if (toys>=50){
           income *=0.75;
       }


       income *= 0.9;

       if (vacationPrice<=income){
           System.out.printf("Yes! %.2f lv left.",income-vacationPrice );
       }
       else {

           System.out.printf("Not enough money! %.2f lv needed.",vacationPrice- income);
       }


    }
}
