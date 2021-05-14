import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int OwnerDogs = Integer.parseInt(scanner.nextLine());
        int OtherDogs = Integer.parseInt(scanner.nextLine());
        Double Price1 = OwnerDogs*2.50;
        int Price2 = OtherDogs*4;
        Double FinalPrice = Price1 + Price2;
        System.out.printf("%f lv.",FinalPrice);



    }
}
