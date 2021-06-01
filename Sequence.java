package WhileCycle;

import java.util.Scanner;

public class Sequence2k1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum=1;
        while (sum<=number){
            System.out.println(sum);
            sum=2*sum+1;
                    
        }

    }
}
