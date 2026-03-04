public class Birds extends Animals{
	
	private double wingspan;
	
	public Birds(String name, int age, String dietType, double wingspan) {
        super(name, age, dietType);
        this.wingspan = wingspan;
    }

    public void fly() {
        System.out.println(name + " is flying.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Wingspan  : " + wingspan + " meters");
        System.out.println("---------------------------");
    }
}