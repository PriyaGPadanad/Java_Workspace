public class Road {
    String name;
    String type;
    double length; 
    int lanes;

    public static void main(String[] args) {
        Road road1 = new Road();
        road1.name = "Interstate 80";
        road1.type = "Highway";
        road1.length = 2900.0; 
        road1.lanes = 6;

        Road road2 = new Road();
        road2.name = "Sunset Boulevard";
        road2.type = "Street";
        road2.length = 22.0;
        road2.lanes = 4;

        Road road3 = new Road();
        road3.name = "Wall Street";
        road3.type = "Street";
        road3.length = 0.7;
        road3.lanes = 2;

        Road road4 = new Road();
        road4.name = "Rodeo Drive";
        road4.type = "Street";
        road4.length = 2.0;
        road4.lanes = 2;

        Road road5 = new Road();
        road5.name = "Lombard Street";
        road5.type = "Street";
        road5.length = 0.125;
        road5.lanes = 1;

        Road road6 = new Road();
        road6.name = "Abbey Road";
        road6.type = "Street";
        road6.length = 0.7;
        road6.lanes = 2;

        Road road7 = new Road();
        road7.name = "Route 66";
        road7.type = "Highway";
        road7.length = 2448.0; 
        road7.lanes = 2;

        Road road8 = new Road();
        road8.name = "Mulholland Drive";
        road8.type = "Street";
        road8.length = 21.0;
        road8.lanes = 2;

        Road road9 = new Road();
        road9.name = "Dark Alley";
        road9.type = "Alley";
        road9.length = 0.2;
        road9.lanes = 1;

        Road road10 = new Road();
        road10.name = "Country Lane";
        road10.type = "Street";
        road10.length = 5.0;
        road10.lanes = 2;

        System.out.println("road1 name:" + road1.name);
        System.out.println("road1 type:" + road1.type);
        System.out.println("road1 length:" + road1.length);
        System.out.println("road1 lanes:" + road1.lanes);

        System.out.println("road2 name:" + road2.name);
        System.out.println("road2 type:" + road2.type);
        System.out.println("road2 length:" + road2.length);
        System.out.println("road2 lanes:" + road2.lanes);

        System.out.println("road3 name:" + road3.name);
        System.out.println("road3 type:" + road3.type);
        System.out.println("road3 length:" + road3.length);
        System.out.println("road3 lanes:" + road3.lanes);

        System.out.println("road4 name:" + road4.name);
        System.out.println("road4 type:" + road4.type);
        System.out.println("road4 length:" + road4.length);
        System.out.println("road4 lanes:" + road4.lanes);

        System.out.println("road5 name:" + road5.name);
        System.out.println("road5 type:" + road5.type);
        System.out.println("road5 length:" + road5.length);
        System.out.println("road5 lanes:" + road5.lanes);

        System.out.println("road6 name:" + road6.name);
        System.out.println("road6 type:" + road6.type);
        System.out.println("road6 length:" + road6.length);
        System.out.println("road6 lanes:" + road6.lanes);

        System.out.println("road7 name:" + road7.name);
        System.out.println("road7 type:" + road7.type);
        System.out.println("road7 length:" + road7.length);
        System.out.println("road7 lanes:" + road7.lanes);

        System.out.println("road8 name:" + road8.name);
        System.out.println("road8 type:" + road8.type);
        System.out.println("road8 length:" + road8.length);
        System.out.println("road8 lanes:" + road8.lanes);

        System.out.println("road9 name:" + road9.name);
        System.out.println("road9 type:" + road9.type);
        System.out.println("road9 length:" + road9.length);
        System.out.println("road9 lanes:" + road9.lanes);

        System.out.println("road10 name:" + road10.name);
        System.out.println("road10 type:" + road10.type);
        System.out.println("road10 length:" + road10.length);
        System.out.println("road10 lanes:" + road10.lanes);
    }
}