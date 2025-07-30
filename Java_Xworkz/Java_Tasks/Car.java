class Car {
    String model;
    int year;

    
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

class House {
    int rooms;
    String location;

    
    House(int rooms, String location) {
        this.rooms = rooms;
        this.location = location;
    }
}

class Book {
    String title;
    String author;

    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Computer {
    String brand;
    String processor;

    
    Computer(String brand, String processor) {
        this.brand = brand;
        this.processor = processor;
    }
}

class Phone {
    String brand;
    int storage;

    
    Phone(String brand, int storage) {
        this.brand = brand;
        this.storage = storage;
    }
}

public class MainExplicit {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Car car = new Car("Sedan", 2022);
            House house = new House(4, "Bengaluru");
            Book book = new Book("Invisible Cities", "Italo Calvino");
            Computer computer = new Computer("Dell", "Intel i7");
            Phone phone = new Phone("Apple", 128);
        }
    }
}