package ConditionalStatementsAdvanced;

import java.util.Scanner;
import java.util.function.DoublePredicate;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String feedback = scanner.nextLine();
        int nights = days - 1;
        double price = 0.0;

        switch (roomType) {
            case "room for one person":
                price=18;
                break;
            case "apartment":
                price=25;
                if (nights<10){
                    price=price*0.7;
                }else if (nights<=15){
                    price=price*0.65;
                }else if (nights>15){
                    price=price*0.5;
                }
                break;
            case "president apartment":
                price=35;
                if (nights<10){
                    price=price*0.9;
                }else if (nights<=15){
                    price=price*0.85;
                }else if (nights>15){
                    price=price*0.8;
                }
                break;


        }
        double totalPrice=price*nights;

        if (feedback.equals("positive")){
            totalPrice=totalPrice*1.25;
        }else if (feedback.equals("negative")){
            totalPrice=totalPrice*0.9;
        }

        System.out.printf("%.2f",totalPrice);


    }
}

