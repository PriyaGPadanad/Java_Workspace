class Animal {
    String type; 
}

class Vehicle {
    String model; 
}

class Book {
    String title; 
}

class Computer {
    String brand; 
}

class Phone {
    String name; 
}

public class Main {
    public static void main(String[] args) {
        
        Animal[] animals = new Animal[5];
        Vehicle[] vehicles = new Vehicle[5];
        Book[] books = new Book[5];
        Computer[] computers = new Computer[5];
        Phone[] phones = new Phone[5];

       
        for (int i = 0; i < 5; i++) {
            animals[i] = new Animal();
            vehicles[i] = new Vehicle();
            books[i] = new Book();
            computers[i] = new Computer();
            phones[i] = new Phone();
        }

        System.out.println("Successfully created 25 instances in total!");
    }
}
