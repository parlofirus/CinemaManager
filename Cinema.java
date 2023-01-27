package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        int length = scanner.nextInt();

        System.out.println("Enter the number of seats in each row:");
        int width = scanner.nextInt();

        int purchased = 0;
        int income = 0;
        float percentage = 0;
        float ticket = length * width;
        int total;
        if(length * width <= 60) {
            total = length * width * 10;
        }
        else total = (( (length/2) * width * 10) + ((length - length/2) * width * 8)); 

        String top = " ";
        for(int i = 1; i <= width; i++) {
            top = top + " " + i;
        }

        String[][] cinema = new String[length][width + 1];
        for(int i = 0; i < cinema.length; i++) {
            for(int j = 1; j < cinema[i].length; j++) {
                cinema[i][j] = " S";
            }
            cinema[i][0] = Integer.toString(i + 1);
        }

        Boolean Running = true;
        while(Running){
            System.out.println();
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    ShowSeats(top, cinema);
                    break;
                case 2:
                    income = BuyTicket(length, width, income, cinema);
                    purchased += 1;
                    float floatpurchased = purchased;
                    percentage = (floatpurchased/ticket)*100;
                    break;
                case 3:
                    Statistics(purchased, income, percentage, total);
                    break;
                case 0:
                    Running = false;
                    break;
            }
        }
    }

    public static void ShowSeats(String top, String[][] cinema) {
        System.out.println();
        System.out.println("Cinema:");
        System.out.println(top);
        for(int i = 0; i < cinema.length; i++) {
            for(int j = 0; j < cinema[i].length; j++) {
                System.out.print(cinema[i][j]);
            }
            System.out.println();
        }
    }

    public static int BuyTicket(int length, int width, int income,  String[][]cinema) {
        System.out.println();
        System.out.println("Enter a row number:");
        int RowNum = scanner.nextInt();

        System.out.println("Enter a seat number in that row:");
        int SeatNum = scanner.nextInt();

        while(RowNum > length|| SeatNum > width || cinema[RowNum - 1][SeatNum] == " B") {
            if(RowNum > length|| SeatNum > width) {
                System.out.println("Wrong input!");
            }
            else if(cinema[RowNum - 1][SeatNum] == " B" ) {
                System.out.println("That ticket has already been purchased!");
            }
            System.out.println();
            System.out.println("Enter a row number:");
            RowNum = scanner.nextInt();

            System.out.println("Enter a seat number in that row:");
            SeatNum = scanner.nextInt();
        }

        int price = 10;
        if(length * width > 60) {
            if(RowNum > length / 2) {
                price = 8;
            }
        }
        income += price;

        System.out.println("Ticket price: $" + price);
        cinema[RowNum - 1][SeatNum] = " B";
        return income;
    }

    public static void Statistics(int purchased, int income, float percentage, int total) {
        System.out.printf("Number of purchased tickets: %d%nPercentage: %.2f%%%nCurrent income: $%d%nTotal income: $%d%n", purchased, percentage, income, total);
    }
}