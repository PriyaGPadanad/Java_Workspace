class RatPoisonRun {

    public static void main(String[] values) {

        String brand1 = "D-Con";
        String type1 = "Bait";
        double weight1 = 100.0;

        RatPoison poison1 = new RatPoison(brand1, type1, weight1);
        System.out.println("poison1 Brand:" + poison1.brand);
        System.out.println("poison1 Type:" + poison1.type);
        System.out.println("poison1 Weight:" + poison1.weight + "g");

        RatPoison poison2 = new RatPoison("Just One Bite", "Block", 50.0);
        System.out.println("poison2 Brand:" + poison2.brand);
        System.out.println("poison2 Type:" + poison2.type);
        System.out.println("poison2 Weight:" + poison2.weight + "g");

        RatPoison poison3 = new RatPoison("Tomcat", "Powder", 200.0);
        System.out.println("poison3 Brand:" + poison3.brand);
        System.out.println("poison3 Type:" + poison3.type);
        System.out.println("poison3 Weight:" + poison3.weight + "g");

        RatPoison poison4 = new RatPoison("Final Blox", "Block", 75.0);
        System.out.println("poison4 Brand:" + poison4.brand);
        System.out.println("poison4 Type:" + poison4.type);
        System.out.println("poison4 Weight:" + poison4.weight + "g");

        RatPoison poison5 = new RatPoison("Motomco", "Bait", 150.0);
        System.out.println("poison5 Brand:" + poison5.brand);
        System.out.println("poison5 Type:" + poison5.type);
        System.out.println("poison5 Weight:" + poison5.weight + "g");
    }
}
