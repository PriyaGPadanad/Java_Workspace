class HarpicRun {

    public static void main(String[] values) {

        String variant1 = "Original";
        double volume1 = 500.0;
        String scent1 = "Pine";

        String variant2 = "Power Plus";
        double volume2 = 750.0;
        String scent2 = "Citrus";

        String variant3 = "Bathroom Cleaner";
        double volume3 = 1000.0;
        String scent3 = "Floral";

        String variant4 = "Original";
        double volume4 = 250.0;
        String scent4 = "Pine";

        String variant5 = "Power Plus";
        double volume5 = 1000.0;
        String scent5 = "Citrus";

        Harpic harpic1 = new Harpic(variant1, volume1, scent1);
        System.out.println("harpic1 Variant:" + harpic1.variant);
        System.out.println("harpic1 Volume:" + harpic1.volume + "ml");
        System.out.println("harpic1 Scent:" + harpic1.scent);

        Harpic harpic2 = new Harpic(variant2, volume2, scent2);
        System.out.println("harpic2 Variant:" + harpic2.variant);
        System.out.println("harpic2 Volume:" + harpic2.volume + "ml");
        System.out.println("harpic2 Scent:" + harpic2.scent);

        Harpic harpic3 = new Harpic(variant3, volume3, scent3);
        System.out.println("harpic3 Variant:" + harpic3.variant);
        System.out.println("harpic3 Volume:" + harpic3.volume + "ml");
        System.out.println("harpic3 Scent:" + harpic3.scent);

        Harpic harpic4 = new Harpic(variant4, volume4, scent4);
        System.out.println("harpic4 Variant:" + harpic4.variant);
        System.out.println("harpic4 Volume:" + harpic4.volume + "ml");
        System.out.println("harpic4 Scent:" + harpic4.scent);

        Harpic harpic5 = new Harpic(variant5, volume5, scent5);
        System.out.println("harpic5 Variant:" + harpic5.variant);
        System.out.println("harpic5 Volume:" + harpic5.volume + "ml");
        System.out.println("harpic5 Scent:" + harpic5.scent);
    }
}