interface Payment {
    void pay(int amount);
    void refund(int amount);
}

class CreditCard implements Payment {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }

    public void refund(int amount) {
        System.out.println("Refunded " + amount + " to Credit Card");
    }
}

class UPI implements Payment {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }

    public void refund(int amount) {
        System.out.println("Refunded " + amount + " to UPI");
    }
}

class Tester {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new UPI();

        p1.pay(5000);
        p1.refund(1000);

        p2.pay(2000);
        p2.refund(500);
    }
}