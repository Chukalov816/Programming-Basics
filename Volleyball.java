package CSAdvancedExcercise;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String yearType= scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        double sofiaWeekends=48-h;
        double sofiaGames=sofiaWeekends*3/4;
        double holiday=p;
        double holidayGames=holiday*2/3;

        double result= sofiaGames+holidayGames+h;

        if (yearType.equals("leap")){
            result*=1.15;
        }
        result=Math.floor(result);
        System.out.printf("%.0f",result);


    }
}
