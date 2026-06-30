import java.util.Scanner;

public class TicketBookingSystem {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

        Ticket[] tickets = new Ticket[100];
        int count = 0;
        int choice;

        do {
            System.out.println("\n===== TICKET BOOKING SYSTEM =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Display All Tickets");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Search Ticket");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Ticket ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Destination: ");
                    String destination = sc.nextLine();

                    tickets[count] = new Ticket(id, name, destination);
                    count++;

                    System.out.println("Ticket Booked Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No tickets booked.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            tickets[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Ticket ID to Cancel: ");
                    int cancelId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (tickets[i].ticketId == cancelId) {
                            found = true;

                            if (tickets[i].booked) {
                                tickets[i].booked = false;
                                System.out.println("Ticket Cancelled Successfully!");
                            } else {
                                System.out.println("Ticket is already cancelled.");
                            }
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Ticket Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Ticket ID to Search: ");
                    int searchId = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (tickets[i].ticketId == searchId) {
                            tickets[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Ticket Not Found!");
                    }
                    break;

                case 5:
                    System.out.println("Thank You for Using Ticket Booking System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice!= 5);

        sc.close();
    }
}

class Ticket {
    int ticketId;
    String passengerName;
    String destination;
    boolean booked;

    Ticket(int ticketId, String passengerName, String destination) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.destination = destination;
        this.booked = true;
    }

    
    void display() {
        System.out.println("\nTicket ID      : " + ticketId);
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Destination    : " + destination);
        System.out.println("Status         : " + (booked ? "Booked" : "Cancelled"));
        System.out.println("----------------------------");
    }
}
