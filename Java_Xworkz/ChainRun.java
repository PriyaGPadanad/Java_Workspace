class ChainRun {

    public static void main(String[] values) {

        String material1 = "Gold";
        double length1 = 24.0;
        String style1 = "Rope";

        Chain chain1 = new Chain(material1, length1, style1);
        System.out.println("chain1 Material:" + chain1.material);
        System.out.println("chain1 Length:" + chain1.length + " inches");
        System.out.println("chain1 Style:" + chain1.style);

        Chain chain2 = new Chain("Silver", 20.0, "Curb");
        System.out.println("chain2 Material:" + chain2.material);
        System.out.println("chain2 Length:" + chain2.length + " inches");
        System.out.println("chain2 Style:" + chain2.style);

        Chain chain3 = new Chain("Stainless Steel", 22.0, "Box");
        System.out.println("chain3 Material:" + chain3.material);
        System.out.println("chain3 Length:" + chain3.length + " inches");
        System.out.println("chain3 Style:" + chain3.style);

        Chain chain4 = new Chain("Platinum", 18.0, "Cable");
        System.out.println("chain4 Material:" + chain4.material);
        System.out.println("chain4 Length:" + chain4.length + " inches");
        System.out.println("chain4 Style:" + chain4.style);

        Chain chain5 = new Chain("Leather", 30.0, "Braided");
        System.out.println("chain5 Material:" + chain5.material);
        System.out.println("chain5 Length:" + chain5.length + " inches");
        System.out.println("chain5 Style:" + chain5.style);
    }
}


