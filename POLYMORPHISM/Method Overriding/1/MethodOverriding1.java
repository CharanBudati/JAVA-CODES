class Calculator {

    public int add(int a, int b) {
        System.out.println("Base class add()");
        return a + b;
    }

    protected void display() {
        System.out.println("This is Calculator display()");
    }

    private void show() {
        System.out.println("Private show() in Calculator");
    }

    public void accessPrivate() {
        show();
    }
}

class AdvancedCalculator extends Calculator {

    @Override
    public int add(int a, int b) {
        System.out.println("AdvancedCalculator add() (modified behavior)");
        return a + b + 10;
    }

    @Override
    protected void display() {
        System.out.println("This is AdvancedCalculator display()");
    }

    public void show() {
        System.out.println("show() in AdvancedCalculator");
    }
}

public class MethodOverriding1 {
    public static void main(String[] args) {

        Calculator obj1 = new Calculator();
        System.out.println("Sum (Calculator): " + obj1.add(5, 10));
        obj1.display();
        obj1.accessPrivate();

        System.out.println("----------------------");

        AdvancedCalculator obj2 = new AdvancedCalculator();
        System.out.println("Sum (AdvancedCalculator): " + obj2.add(5, 10));
        obj2.display();
        obj2.show();

        System.out.println("----------------------");

        Calculator obj3 = new AdvancedCalculator();
        System.out.println("Sum (Polymorphism): " + obj3.add(5, 10));
        obj3.display();
        obj3.accessPrivate();
    }
}