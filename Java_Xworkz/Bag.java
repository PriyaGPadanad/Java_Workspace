public class Bag {
    String brand;
    String material;
    double capacity; 
    double price;

    public static void main(String[] args) {
        Bag bag1 = new Bag();
        bag1.brand = "Herschel";
        bag1.material = "Canvas";
        bag1.capacity = 25.0;
        bag1.price = 79.99;

        Bag bag2 = new Bag();
        bag2.brand = "North Face";
        bag2.material = "Nylon";
        bag2.capacity = 30.0;
        bag2.price = 120.00;

        Bag bag3 = new Bag();
        bag3.brand = "Adidas";
        bag3.material = "Polyester";
        bag3.capacity = 20.0;
        bag3.price = 45.00;

        Bag bag4 = new Bag();
        bag4.brand = "Nike";
        bag4.material = "Polyester";
        bag4.capacity = 22.0;
        bag4.price = 50.00;

        Bag bag5 = new Bag();
        bag5.brand = "Samsonite";
        bag5.material = "Leather";
        bag5.capacity = 15.0;
        bag5.price = 150.00;

        Bag bag6 = new Bag();
        bag6.brand = "Kipling";
        bag6.material = "Nylon";
        bag6.capacity = 18.0;
        bag6.price = 65.00;

        Bag bag7 = new Bag();
        bag7.brand = "Tumi";
        bag7.material = "Ballistic Nylon";
        bag7.capacity = 28.0;
        bag7.price = 250.00;

        Bag bag8 = new Bag();
        bag8.brand = "JanSport";
        bag8.material = "Canvas";
        bag8.capacity = 32.0;
        bag8.price = 55.00;

        Bag bag9 = new Bag();
        bag9.brand = "Osprey";
        bag9.material = "Ripstop Nylon";
        bag9.capacity = 35.0;
        bag9.price = 130.00;

        Bag bag10 = new Bag();
        bag10.brand = "Longchamp";
        bag10.material = "Nylon";
        bag10.capacity = 16.0;
        bag10.price = 110.00;

        System.out.println("bag1 brand:" + bag1.brand);
        System.out.println("bag1 material:" + bag1.material);
        System.out.println("bag1 capacity:" + bag1.capacity);
        System.out.println("bag1 price:" + bag1.price);

        System.out.println("bag2 brand:" + bag2.brand);
        System.out.println("bag2 material:" + bag2.material);
        System.out.println("bag2 capacity:" + bag2.capacity);
        System.out.println("bag2 price:" + bag2.price);

        System.out.println("bag3 brand:" + bag3.brand);
        System.out.println("bag3 material:" + bag3.material);
        System.out.println("bag3 capacity:" + bag3.capacity);
        System.out.println("bag3 price:" + bag3.price);

        System.out.println("bag4 brand:" + bag4.brand);
        System.out.println("bag4 material:" + bag4.material);
        System.out.println("bag4 capacity:" + bag4.capacity);
        System.out.println("bag4 price:" + bag4.price);

        System.out.println("bag5 brand:" + bag5.brand);
        System.out.println("bag5 material:" + bag5.material);
        System.out.println("bag5 capacity:" + bag5.capacity);
        System.out.println("bag5 price:" + bag5.price);

        System.out.println("bag6 brand:" + bag6.brand);
        System.out.println("bag6 material:" + bag6.material);
        System.out.println("bag6 capacity:" + bag6.capacity);
        System.out.println("bag6 price:" + bag6.price);

        System.out.println("bag7 brand:" + bag7.brand);
        System.out.println("bag7 material:" + bag7.material);
        System.out.println("bag7 capacity:" + bag7.capacity);
        System.out.println("bag7 price:" + bag7.price);

        System.out.println("bag8 brand:" + bag8.brand);
        System.out.println("bag8 material:" + bag8.material);
        System.out.println("bag8 capacity:" + bag8.capacity);
        System.out.println("bag8 price:" + bag8.price);

        System.out.println("bag9 brand:" + bag9.brand);
        System.out.println("bag9 material:" + bag9.material);
        System.out.println("bag9 capacity:" + bag9.capacity);
        System.out.println("bag9 price:" + bag9.price);

        System.out.println("bag10 brand:" + bag10.brand);
        System.out.println("bag10 material:" + bag10.material);
        System.out.println("bag10 capacity:" + bag10.capacity);
        System.out.println("bag10 price:" + bag10.price);
    }
}