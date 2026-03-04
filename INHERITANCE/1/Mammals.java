class Mammals extends Animals {

    private String furColor;

    public Mammals(String name, int age, String dietType, String furColor) {
        super(name, age, dietType);
        this.furColor = furColor;
    }

    public void run() {
        System.out.println(name + " is running.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fur Color : " + furColor);
        System.out.println("---------------------------");
    }
}
