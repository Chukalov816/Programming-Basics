package CSAdvancedExcercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double price=0.0;


        switch (type){
            case "Premiere":
                price=12;
                break;
            case "Normal":
                price=7.50;
                break;
            case "Discount":
                price=5.00;
        }
        double income = r*c*price;
        System.out.printf("%.2f leva",income);

    }
}
