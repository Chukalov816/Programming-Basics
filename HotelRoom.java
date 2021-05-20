package CSAdvancedExcercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studioPrice=0.0;
        double apartmentPrice=0.0;



       if (month.equals("May")||month.equals("October")){
           studioPrice=50;
           apartmentPrice=65;
           if (nights>7&& nights<=14){
               studioPrice*=0.95;
           }else if (nights>14){
               studioPrice*=0.7;
               apartmentPrice*=0.9;
           }
       }else if (month.equals("June")||month.equals("September")){
           studioPrice=75.20;
           apartmentPrice=68.70;
           if (nights>14){
               studioPrice*=0.8;
               apartmentPrice*=0.9;
           }
       }else{
           studioPrice=76;
           apartmentPrice=77;
           if (nights>14){
               apartmentPrice*=0.9;
           }
       }
        double studioStay = studioPrice*nights;
       double apartmentStay = apartmentPrice*nights;

        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.",apartmentStay,studioStay);


    }
}
