public class Star {
    String name;
    String constellation;
    double magnitude; 
    double distance; 

    public static void main(String[] args) {
        Star star1 = new Star();
        star1.name = "Sirius";
        star1.constellation = "Canis Major";
        star1.magnitude = -1.46;
        star1.distance = 8.6;

        Star star2 = new Star();
        star2.name = "Canopus";
        star2.constellation = "Carina";
        star2.magnitude = -0.72;
        star2.distance = 310;

        Star star3 = new Star();
        star3.name = "Alpha Centauri";
        star3.constellation = "Centaurus";
        star3.magnitude = -0.27;
        star3.distance = 4.37;

        Star star4 = new Star();
        star4.name = "Arcturus";
        star4.constellation = "Bootes";
        star4.magnitude = -0.04;
        star4.distance = 37;

        Star star5 = new Star();
        star5.name = "Vega";
        star5.constellation = "Lyra";
        star5.magnitude = 0.03;
        star5.distance = 25;

        Star star6 = new Star();
        star6.name = "Capella";
        star6.constellation = "Auriga";
        star6.magnitude = 0.08;
        star6.distance = 42;

        Star star7 = new Star();
        star7.name = "Rigel";
        star7.constellation = "Orion";
        star7.magnitude = 0.18;
        star7.distance = 860;

        Star star8 = new Star();
        star8.name = "Procyon";
        star8.constellation = "Canis Minor";
        star8.magnitude = 0.34;
        star8.distance = 11.46;

        Star star9 = new Star();
        star9.name = "Achernar";
        star9.constellation = "Eridanus";
        star9.magnitude = 0.45;
        star9.distance = 139;

        Star star10 = new Star();
        star10.name = "Betelgeuse";
        star10.constellation = "Orion";
        star10.magnitude = 0.42; 
        star10.distance = 640;

        System.out.println("star1 name:" + star1.name);
        System.out.println("star1 constellation:" + star1.constellation);
        System.out.println("star1 magnitude:" + star1.magnitude);
        System.out.println("star1 distance:" + star1.distance);

        System.out.println("star2 name:" + star2.name);
        System.out.println("star2 constellation:" + star2.constellation);
        System.out.println("star2 magnitude:" + star2.magnitude);
        System.out.println("star2 distance:" + star2.distance);

        System.out.println("star3 name:" + star3.name);
        System.out.println("star3 constellation:" + star3.constellation);
        System.out.println("star3 magnitude:" + star3.magnitude);
        System.out.println("star3 distance:" + star3.distance);

        System.out.println("star4 name:" + star4.name);
        System.out.println("star4 constellation:" + star4.constellation);
        System.out.println("star4 magnitude:" + star4.magnitude);
        System.out.println("star4 distance:" + star4.distance);

        System.out.println("star5 name:" + star5.name);
        System.out.println("star5 constellation:" + star5.constellation);
        System.out.println("star5 magnitude:" + star5.magnitude);
        System.out.println("star5 distance:" + star5.distance);

        System.out.println("star6 name:" + star6.name);
        System.out.println("star6 constellation:" + star6.constellation);
        System.out.println("star6 magnitude:" + star6.magnitude);
        System.out.println("star6 distance:" + star6.distance);

        System.out.println("star7 name:" + star7.name);
        System.out.println("star7 constellation:" + star7.constellation);
        System.out.println("star7 magnitude:" + star7.magnitude);
        System.out.println("star7 distance:" + star7.distance);

        System.out.println("star8 name:" + star8.name);
        System.out.println("star8 constellation:" + star8.constellation);
        System.out.println("star8 magnitude:" + star8.magnitude);
        System.out.println("star8 distance:" + star8.distance);

        System.out.println("star9 name:" + star9.name);
        System.out.println("star9 constellation:" + star9.constellation);
        System.out.println("star9 magnitude:" + star9.magnitude);
        System.out.println("star9 distance:" + star9.distance);

        System.out.println("star10 name:" + star10.name);
        System.out.println("star10 constellation:" + star10.constellation);
        System.out.println("star10 magnitude:" + star10.magnitude);
        System.out.println("star10 distance:" + star10.distance);
    }
}