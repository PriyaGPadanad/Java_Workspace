public class Train {
    String model;
    int carriages;
    double maxSpeed; 
    String type; 

    public static void main(String[] args) {
        Train train1 = new Train();
        train1.model = "ICE 3";
        train1.carriages = 8;
        train1.maxSpeed = 330.0;
        train1.type = "Passenger";

        Train train2 = new Train();
        train2.model = "Shinkansen E5";
        train2.carriages = 10;
        train2.maxSpeed = 320.0;
        train2.type = "Passenger";

        Train train3 = new Train();
        train3.model = "Freightliner Class 66";
        train3.carriages = 20;
        train3.maxSpeed = 120.0;
        train3.type = "Cargo";

        Train train4 = new Train();
        train4.model = "TGV Duplex";
        train4.carriages = 8;
        train4.maxSpeed = 320.0;
        train4.type = "Passenger";

        Train train5 = new Train();
        train5.model = "Amtrak Acela";
        train5.carriages = 6;
        train5.maxSpeed = 240.0;
        train5.type = "Passenger";

        Train train6 = new Train();
        train6.model = "CRH380A";
        train6.carriages = 8;
        train6.maxSpeed = 380.0;
        train6.type = "Passenger";

        Train train7 = new Train();
        train7.model = "DB Class 101";
        train7.carriages = 12;
        train7.maxSpeed = 200.0;
        train7.type = "Passenger";

        Train train8 = new Train();
        train8.model = "Union Pacific Big Boy";
        train8.carriages = 50;
        train8.maxSpeed = 130.0;
        train8.type = "Cargo";

        Train train9 = new Train();
        train9.model = "Eurostar e320";
        train9.carriages = 16;
        train9.maxSpeed = 320.0;
        train9.type = "Passenger";

        Train train10 = new Train();
        train10.model = "Indian Railways WDM-3A";
        train10.carriages = 24;
        train10.maxSpeed = 120.0;
        train10.type = "Passenger/Cargo";

        System.out.println("train1 model:" + train1.model);
        System.out.println("train1 carriages:" + train1.carriages);
        System.out.println("train1 maxSpeed:" + train1.maxSpeed);
        System.out.println("train1 type:" + train1.type);

        System.out.println("train2 model:" + train2.model);
        System.out.println("train2 carriages:" + train2.carriages);
        System.out.println("train2 maxSpeed:" + train2.maxSpeed);
        System.out.println("train2 type:" + train2.type);

        System.out.println("train3 model:" + train3.model);
        System.out.println("train3 carriages:" + train3.carriages);
        System.out.println("train3 maxSpeed:" + train3.maxSpeed);
        System.out.println("train3 type:" + train3.type);

        System.out.println("train4 model:" + train4.model);
        System.out.println("train4 carriages:" + train4.carriages);
        System.out.println("train4 maxSpeed:" + train4.maxSpeed);
        System.out.println("train4 type:" + train4.type);

        System.out.println("train5 model:" + train5.model);
        System.out.println("train5 carriages:" + train5.carriages);
        System.out.println("train5 maxSpeed:" + train5.maxSpeed);
        System.out.println("train5 type:" + train5.type);

        System.out.println("train6 model:" + train6.model);
        System.out.println("train6 carriages:" + train6.carriages);
        System.out.println("train6 maxSpeed:" + train6.maxSpeed);
        System.out.println("train6 type:" + train6.type);

        System.out.println("train7 model:" + train7.model);
        System.out.println("train7 carriages:" + train7.carriages);
        System.out.println("train7 maxSpeed:" + train7.maxSpeed);
        System.out.println("train7 type:" + train7.type);

        System.out.println("train8 model:" + train8.model);
        System.out.println("train8 carriages:" + train8.carriages);
        System.out.println("train8 maxSpeed:" + train8.maxSpeed);
        System.out.println("train8 type:" + train8.type);

        System.out.println("train9 model:" + train9.model);
        System.out.println("train9 carriages:" + train9.carriages);
        System.out.println("train9 maxSpeed:" + train9.maxSpeed);
        System.out.println("train9 type:" + train9.type);

        System.out.println("train10 model:" + train10.model);
        System.out.println("train10 carriages:" + train10.carriages);
        System.out.println("train10 maxSpeed:" + train10.maxSpeed);
        System.out.println("train10 type:" + train10.type);
    }
}