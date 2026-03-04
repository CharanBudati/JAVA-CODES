public class GreenfieldZoo {
    public static void main(String[] args) {

        Mammals lion = new Mammals("Lion", 5, "Carnivore", "Golden");
        Birds eagle = new Birds("Eagle", 3, "Carnivore", 2.1);
        Reptiles snake = new Reptiles("Cobra", 2, "Carnivore", true);

        lion.displayDetails();
        lion.eat();
        lion.run();
        lion.sleep();

        eagle.displayDetails();
        eagle.eat();
        eagle.fly();
        eagle.sleep();

        snake.displayDetails();
        snake.eat();
        snake.crawl();
        snake.sleep();
    }
}

/*
                +------------------+
                |     Animal       |
                +------------------+
                | - name: String   |
                | - age: int       |
                | - dietType: String|
                +------------------+
                | + eat()          |
                | + sleep()        |
                | + displayDetails()|
                +------------------+
                        ▲
         ---------------------------------
         |               |               |
+---------------+ +---------------+ +---------------+
|    Mammal     | |     Bird      | |    Reptile    |
+---------------+ +---------------+ +---------------+
| - furColor    | | - wingspan    | | - isVenomous  |
+---------------+ +---------------+ +---------------+
| + run()       | | + fly()       | | + crawl()     |
+---------------+ +---------------+ +---------------+
*/