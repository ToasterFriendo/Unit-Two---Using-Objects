package day3;

public class Driver {
    public static void main(String[] args) {
        // Creating a Dog object with both name and age
        Dog dog1 = new Dog("Rocky","Labrador",15);

        // Testing the Dog's methods
        dog1.bark(3);
        dog1.eat("bone");
        dog1.sleep(2);
    }
}

