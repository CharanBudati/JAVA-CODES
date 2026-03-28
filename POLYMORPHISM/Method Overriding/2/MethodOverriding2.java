import java.util.Scanner;

class InvoiceProcessor {

    public void generateInvoice(String name, double amount) {
        double total = calculate(amount);
        System.out.println("Customer: " + name);
        System.out.println("Amount: " + total);
    }

    private double calculate(double amount) {
        return amount + (amount * 0.18);
    }

    public void accessInternal(String name, double amount) {
        generateInvoice(name, amount);
    }
}

class RetailInvoice extends InvoiceProcessor {

    public void generateInvoice(String name, double amount) {
        double discounted = amount - (amount * 0.1);
        System.out.println("Retail Customer: " + name);
        System.out.println("Final Amount: " + discounted);
    }
}

public class MethodOverriding2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = sc.nextLine();

         System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        InvoiceProcessor obj = new RetailInvoice();
        
        obj.accessInternal(name, amount);
    }
}