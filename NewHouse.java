package CSAdvancedExcercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowercount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double expense = 0.0;

        switch (flowerType) {
            case "Roses":
                expense = flowercount * 5;
                if (flowercount > 80) {
                    expense *= 0.90;
                }
                break;
            case "Dahlias":
                expense =flowercount*3.80;
                if (flowercount > 90) {
                expense*=0.85;
                }
                break;
            case "Tulips":
                expense=flowercount *2.80;
                if (flowercount>80){
                    expense*=0.85;
                }
                break;
            case "Narcissus":
                expense= flowercount*3.0;
                if (flowercount<120){
                    expense*=1.15;
                }
                break;
            case "Gladiolus":
                expense=flowercount*2.50;
                if (flowercount<80){
                    expense*=1.20;
                }
                break;

        }

        if (budget>=expense){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",flowercount,flowerType,budget-expense);

        }else {
            System.out.printf("Not enough money, you need %.2f leva more.",expense-budget);
        }

}
}
