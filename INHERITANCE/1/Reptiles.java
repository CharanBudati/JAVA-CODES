class Reptiles extends Animals {

    private boolean venomous;

    public Reptiles(String name, int age, String dietType, boolean venomous) {
        super(name, age, dietType);
        this.venomous = venomous;
    }

    public void crawl() {
        System.out.println(name + " is crawling.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Venomous  : " + (venomous ? "Yes" : "No"));
        System.out.println("---------------------------");
    }
}