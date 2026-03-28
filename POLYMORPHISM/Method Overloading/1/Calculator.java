class Calculator {

    // Public method: add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Protected method: add three integers
    protected int add(int a, int b, int c) {
        return a + b + c;
    }

    // Private method: add two decimal numbers
    private double add(double a, double b) {
        return a + b;
    }

    // Public method to access private method
    public void callingPrivateMethodAddition(double x, double y) {
        double result = add(x, y); // calling private method
        System.out.println("Sum of two decimal numbers: " + result);
    }

    public static void main(String[] args) {
		
        Calculator calculator = new Calculator();

        
        System.out.println("Sum of 2 integers: " + calculator.add(25, 19));

      
        System.out.println("Sum of 3 integers: " + calculator.add(25, 7, 2008));

      
        calculator.callingPrivateMethodAddition(2.5, 1.9);
    }
}