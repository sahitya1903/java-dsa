import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {
            if (amount > balance) {
                throw new InsufficientFundsException("Insufficient Balance!");
            }
            balance -= amount;
            System.out.println("Withdrawal Successful!");
            System.out.println("Updated Balance: " + balance);

        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }finally{
            sc.close();
        }
    }
}
