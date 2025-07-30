class AnkletRun {

    public static void main(String[] values) {

        String material1 = "Silver";
        String style1 = "Chain";
        double length1 = 9.5;

        Anklet anklet1 = new Anklet(material1, style1, length1);
        System.out.println("anklet1 Material:" + anklet1.material);
        System.out.println("anklet1 Style:" + anklet1.style);
        System.out.println("anklet1 Length:" + anklet1.length + " inches");

        Anklet anklet2 = new Anklet("Gold", "Beaded", 10.0);
        System.out.println("anklet2 Material:" + anklet2.material);
        System.out.println("anklet2 Style:" + anklet2.style);
        System.out.println("anklet2 Length:" + anklet2.length + " inches");

        Anklet anklet3 = new Anklet("Leather", "Braided", 9.0);
        System.out.println("anklet3 Material:" + anklet3.material);
        System.out.println("anklet3 Style:" + anklet3.style);
        System.out.println("anklet3 Length:" + anklet3.length + " inches");

        Anklet anklet4 = new Anklet("Stainless Steel", "Curb", 10.5);
        System.out.println("anklet4 Material:" + anklet4.material);
        System.out.println("anklet4 Style:" + anklet4.style);
        System.out.println("anklet4 Length:" + anklet4.length + " inches");

        Anklet anklet5 = new Anklet("Cotton", "Thread", 8.5);
        System.out.println("anklet5 Material:" + anklet5.material);
        System.out.println("anklet5 Style:" + anklet5.style);
        System.out.println("anklet5 Length:" + anklet5.length + " inches");
    }
}