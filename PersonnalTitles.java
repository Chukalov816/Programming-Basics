package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        String output= "";

        if (age>=16){
            if (gender.equals("m")){
            output="Mr.";
            }else if (gender.equals("f")){
                output="Ms.";
            }
        }
        if (age<16){
            if (gender.equals("m")){
                output="Master";
            }else if (gender.equals("f")){
                output= "Miss";
            }
        }
        System.out.println(output);
    }
}
