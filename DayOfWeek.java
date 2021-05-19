package ConditionalStatementsAdvanced;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());

        String output;

        switch (day) {
            case 1:
                output = "Monday";
                break;
            case 2:
                output = "Tuesday";
                break;
            case 3:
                output = "Wednesday";
                break;
            case 4:
                output = "Thursday";
                break;
            case 5:
                output = "Friday";
                break;
            case 6:
                output = "Saturday";
                break;
            case 7:
                output = "Sunday";
                break;
            default:
                output = "Error";
                break;

        }
        System.out.println(output);

    }
}
