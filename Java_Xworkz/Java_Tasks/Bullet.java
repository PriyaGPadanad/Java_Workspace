public class Bullet {
    double caliber; // in millimeters
    double weight; // in grams
    String type; 
    double velocity; // in meters per second

    public static void main(String[] args) {
        Bullet bullet1 = new Bullet();
        bullet1.caliber = 9.0;
        bullet1.weight = 124.0;
        bullet1.type = "FMJ";
        bullet1.velocity = 350.0;

        Bullet bullet2 = new Bullet();
        bullet2.caliber = 5.56;
        bullet2.weight = 62.0;
        bullet2.type = "FMJ";
        bullet2.velocity = 930.0;

        Bullet bullet3 = new Bullet();
        bullet3.caliber = 7.62;
        bullet3.weight = 147.0;
        bullet3.type = "FMJ";
        bullet3.velocity = 850.0;

        Bullet bullet4 = new Bullet();
        bullet4.caliber = 45.0;
        bullet4.weight = 230.0;
        bullet4.type = "Hollow Point";
        bullet4.velocity = 260.0;

        Bullet bullet5 = new Bullet();
        bullet5.caliber = 40.0;
        bullet5.weight = 180.0;
        bullet5.type = "Hollow Point";
        bullet5.velocity = 320.0;

        Bullet bullet6 = new Bullet();
        bullet6.caliber = 38.0;
        bullet6.weight = 158.0;
        bullet6.type = "Lead Round Nose";
        bullet6.velocity = 250.0;

        Bullet bullet7 = new Bullet();
        bullet7.caliber = 22.0;
        bullet7.weight = 40.0;
        bullet7.type = "Lead Round Nose";
        bullet7.velocity = 330.0;

        Bullet bullet8 = new Bullet();
        bullet8.caliber = 308.0;
        bullet8.weight = 168.0;
        bullet8.type = "Match Grade";
        bullet8.velocity = 800.0;

        Bullet bullet9 = new Bullet();
        bullet9.caliber = 300.0;
        bullet9.weight = 200.0;
        bullet9.type = "Magnum";
        bullet9.velocity = 900.0;

        Bullet bullet10 = new Bullet();
        bullet10.caliber = 12.0; // Shotgun shell gauge, roughly equal to 18.5mm
        bullet10.weight = 32.0; // grams of shot
        bullet10.type = "Shot";
        bullet10.velocity = 400.0; // approximate velocity

        System.out.println("bullet1 caliber:" + bullet1.caliber);
        System.out.println("bullet1 weight:" + bullet1.weight);
        System.out.println("bullet1 type:" + bullet1.type);
        System.out.println("bullet1 velocity:" + bullet1.velocity);

        System.out.println("bullet2 caliber:" + bullet2.caliber);
        System.out.println("bullet2 weight:" + bullet2.weight);
        System.out.println("bullet2 type:" + bullet2.type);
        System.out.println("bullet2 velocity:" + bullet2.velocity);

        System.out.println("bullet3 caliber:" + bullet3.caliber);
        System.out.println("bullet3 weight:" + bullet3.weight);
        System.out.println("bullet3 type:" + bullet3.type);
        System.out.println("bullet3 velocity:" + bullet3.velocity);

        System.out.println("bullet4 caliber:" + bullet4.caliber);
        System.out.println("bullet4 weight:" + bullet4.weight);
        System.out.println("bullet4 type:" + bullet4.type);
        System.out.println("bullet4 velocity:" + bullet4.velocity);

        System.out.println("bullet5 caliber:" + bullet5.caliber);
        System.out.println("bullet5 weight:" + bullet5.weight);
        System.out.println("bullet5 type:" + bullet5.type);
        System.out.println("bullet5 velocity:" + bullet5.velocity);

        System.out.println("bullet6 caliber:" + bullet6.caliber);
        System.out.println("bullet6 weight:" + bullet6.weight);
        System.out.println("bullet6 type:" + bullet6.type);
        System.out.println("bullet6 velocity:" + bullet6.velocity);

        System.out.println("bullet7 caliber:" + bullet7.caliber);
        System.out.println("bullet7 weight:" + bullet7.weight);
        System.out.println("bullet7 type:" + bullet7.type);
        System.out.println("bullet7 velocity:" + bullet7.velocity);

        System.out.println("bullet8 caliber:" + bullet8.caliber);
        System.out.println("bullet8 weight:" + bullet8.weight);
        System.out.println("bullet8 type:" + bullet8.type);
        System.out.println("bullet8 velocity:" + bullet8.velocity);

        System.out.println("bullet9 caliber:" + bullet9.caliber);
        System.out.println("bullet9 weight:" + bullet9.weight);
        System.out.println("bullet9 type:" + bullet9.type);
        System.out.println("bullet9 velocity:" + bullet9.velocity);

        System.out.println("bullet10 caliber:" + bullet10.caliber);
        System.out.println("bullet10 weight:" + bullet10.weight);
        System.out.println("bullet10 type:" + bullet10.type);
        System.out.println("bullet10 velocity:" + bullet10.velocity);
    }
}