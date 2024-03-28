import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the customer ID: ");
        int customerId = scanner.nextInt();

        System.out.print("Enter the customer name: ");
        String customerName = scanner.next();

        System.out.print("Enter the unit consumed: ");
        int units = scanner.nextInt();

        double rate;
        if (units <= 199) {
            rate = 1.20;
        } else if (units <= 399) {
            rate = 1.50;
        } else if (units <= 599) {
            rate = 1.80;
        } else {
            rate = 2.00;
        }

        double bill = units * rate;
        if (bill > 400) {
            bill *= 1.15;
        }

        System.out.println("Customer IDNO: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Unit Consumed: " + units);
        System.out.println("Amount Payable: Rs." + bill);

        scanner.close();
    }
}

