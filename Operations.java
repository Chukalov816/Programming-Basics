package CSAdvancedExcercise;

import java.util.Scanner;

public class OperationBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        String symbol = scanner.nextLine();

        double result = 0.0;

        switch (symbol) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                result = n1 / n2;
                break;
            case "%":
                result = n1 % n2;
                break;


        }

        String evenOdd = "";
        if (result % 2 != 0) {
            evenOdd = "odd";
        } else {
            evenOdd = "even";
        }

        if (symbol.equals("+") || symbol.equals("-") || symbol.equals("*")) {
            System.out.printf("%.0f %s %.0f = %.0f - %s", n1, symbol, n2, result, evenOdd);
        } else if (symbol.equals("/") && n2 != 0) {
            System.out.printf("%.0f %s %.0f = %.2f", n1, symbol, n2, result);
        } else if (symbol.equals("%") && n2 != 0) {
            System.out.printf("%.0f %s %.0f = %.0f", n1, symbol, n2, result);
        } else {
            System.out.printf("Cannot divide %.0f by zero", n1);
        }


    }
}







