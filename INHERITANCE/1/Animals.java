class Animals {

    protected String name;
    protected int age;
    protected String dietType;

    public Animals(String name, int age, String dietType) {
        this.name = name;
        this.age = age;
        this.dietType = dietType;
    }

    public void eat() {
        System.out.println(name + " is eating (" + dietType + ").");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void displayDetails() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Diet  : " + dietType);
    }
}