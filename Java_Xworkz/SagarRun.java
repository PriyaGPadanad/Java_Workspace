class SagarRun {

    public static void main(String[] values) {

        String name1 = "Arabian Sea";
        double area1 = 3862000.0;
        double depth1 = 4652.0;

        Sagar sagar1 = new Sagar(name1, area1, depth1);
        System.out.println("sagar1 Name:" + sagar1.name);
        System.out.println("sagar1 Area:" + sagar1.area + " sq km");
        System.out.println("sagar1 Depth:" + sagar1.depth + " m");

        Sagar sagar2 = new Sagar("Bay of Bengal", 2600000.0, 4694.0);
        System.out.println("sagar2 Name:" + sagar2.name);
        System.out.println("sagar2 Area:" + sagar2.area + " sq km");
        System.out.println("sagar2 Depth:" + sagar2.depth + " m");

        Sagar sagar3 = new Sagar("Indian Ocean", 70560000.0, 7290.0);
        System.out.println("sagar3 Name:" + sagar3.name);
        System.out.println("sagar3 Area:" + sagar3.area + " sq km");
        System.out.println("sagar3 Depth:" + sagar3.depth + " m");

        Sagar sagar4 = new Sagar("Red Sea", 438000.0, 3040.0);
        System.out.println("sagar4 Name:" + sagar4.name);
        System.out.println("sagar4 Area:" + sagar4.area + " sq km");
        System.out.println("sagar4 Depth:" + sagar4.depth + " m");

        Sagar sagar5 = new Sagar("Andaman Sea", 600000.0, 3777.0);
        System.out.println("sagar5 Name:" + sagar5.name);
        System.out.println("sagar5 Area:" + sagar5.area + " sq km");
        System.out.println("sagar5 Depth:" + sagar5.depth + " m");
    }
}
