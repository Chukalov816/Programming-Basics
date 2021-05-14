package FSIC;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        double sqm = Double.parseDouble(scanner.nextLine());
        double price = sqm*7.61;
        double discount = price*0.18;
        double finalprice = price - discount;

        System.out.printf("The final price is: %.2f lv.",finalprice);
        System.out.printf("The discount is: %.2f lv.",discount);
        
    }


}
