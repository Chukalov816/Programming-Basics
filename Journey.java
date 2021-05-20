package CSAdvancedExcercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";

        double price = 0.0;

        switch (season){
            case "summer":
                if (budget<=100){
                    destination="Bulgaria";
                    price=budget*0.3;
                }else if (budget<=1000){
                    destination="Balkans";
                    price=budget*0.4;
                }else{
                    destination="Europe";
                    price=budget*0.9;
                }
                break;
            case "winter":

                if (budget<=100){
                    destination="Bulgaria";
                    price=budget*0.7;
                }else if (budget<=1000){
                    destination="Balkans";
                    price=budget*0.8;
                }else{
                    destination="Europe";
                    price=budget*0.9;
                }
                break;

        }

        String accommodation ="";

        if (destination!="Europe" && season.equals("summer")){
            accommodation="Camp";

        }else{
            accommodation="Hotel";
        }

        System.out.printf("Somewhere in %s%n",destination);
        System.out.printf("%s - %.2f",accommodation,price);





    }
}
