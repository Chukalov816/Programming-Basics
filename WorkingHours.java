package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
        String output = "";

        if (hour >= 10 && hour <= 18) {
            switch (day) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
                    output = "open";
                    break;

                case "Sunday":
                    output = "closed";
                    break;

            }

        } else {
            output = "closed";
        }
        System.out.println(output);
    }
}


