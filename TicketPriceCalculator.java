import java.util.Scanner;

public class TicketPriceCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter number of tickets: ");
        int numOfTickets = scanner.nextInt();

        // Determine ticket price based on age
        int ticketPrice;
        if (age >= 60) {
            ticketPrice = 30;
        } else if (age <= 12) {
            ticketPrice = 20;
        } else {
            ticketPrice = 50;
        }

        // Calculate the total cost
        int totalCost = ticketPrice * numOfTickets;

        // Display the total cost
        System.out.println("Total cost for " + numOfTickets + " tickets: Rs. " + totalCost);

        scanner.close();
    }
}
