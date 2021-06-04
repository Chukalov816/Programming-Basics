package NestedLoops;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName= scanner.nextLine();
        int studentTickets=0;
        int standardTicket=0;
        int kidTickets=0;


        while (!"Finish".equals(movieName)){
            int seats= Integer.parseInt(scanner.nextLine());
            int currentPeople=0;
            for (int i = 0; i <seats; i++) {
                String ticketType= scanner.nextLine();
                if ("student".equals(ticketType)){
                    studentTickets++;
                }else if ("standard".equals(ticketType)){
                    standardTicket++;
                }else if ("kid".equals(ticketType)){
                    kidTickets++;
                }else if ("End".equals(ticketType)){
                    break;
                }
                currentPeople++;

            }
            double percentage=1.0*currentPeople/seats*100;
            System.out.printf("%s - %.2f%% full.%n",movieName,percentage);
            movieName= scanner.nextLine();
        }
        int totalTickets=studentTickets+standardTicket+kidTickets;
        System.out.printf( "Total tickets: %d%n",totalTickets);
        System.out.printf("%.2f%% student tickets.%n",studentTickets*1.0/totalTickets*100);
        System.out.printf("%.2f%% standard tickets.%n",standardTicket*1.0/totalTickets*100);
        System.out.printf("%.2f%% kids tickets.",kidTickets*1.0/totalTickets*100);
    }
}

