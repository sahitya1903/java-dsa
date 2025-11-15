import java.util.LinkedList;
import java.util.Scanner;

public class TicketQueue {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Customer\n2. Issue Ticket\n3. Display Queue\n4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    queue.add(sc.nextLine());
                    break;

                case 2:
                    if (!queue.isEmpty())
                        System.out.println("Ticket issued to: " + queue.removeFirst());
                    else
                        System.out.println("Queue is Empty!");
                    break;

                case 3:
                    System.out.println("Current Queue: " + queue);
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
