package ForCycle;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int years = Integer.parseInt(scanner.nextLine());
        double priceWM= Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int toysCount =0;
        double money=9;
        double sum=0;

        for (int i=1;i<=years;i++){
        //even year
            if (i%2==0){
                sum+=money;
                money+=10;
            //odd year
        }else{
              toysCount++;
            }
        }
        sum+=toyPrice*toysCount;
        if (sum>=priceWM){
            System.out.printf("Yes! %.2f",sum-priceWM);
        }else {
            System.out.printf("No! %.2f",priceWM-sum);
        }


    }
}
