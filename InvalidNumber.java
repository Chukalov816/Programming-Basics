package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        boolean isValid = false;
        if (number>=100 && number<= 200 || number==0){
            isValid=true;
        }
        if (!isValid){
            System.out.println("invalid");

        }
    }
}
