package WhileCycle;

import java.util.Scanner;

public class Graduation2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String studentName= scanner.nextLine();

        int badGradeCounter=0;
        double grades=0.0;
        int classes = 0;
        while (classes<12) {
            double currentGrade = Double.parseDouble(scanner.nextLine());
            if (currentGrade < 4){
            badGradeCounter++;
            if (badGradeCounter==2){
                break;
            }
            continue;
            }
            grades=grades+currentGrade;
            classes++;
        }

        if (classes==12){
            System.out.printf("%s graduated. Average grade: %.2f",studentName,grades/12);
        }else {
            System.out.printf("%s has been excluded at %d grade",studentName,++classes);
        }

    }

}
