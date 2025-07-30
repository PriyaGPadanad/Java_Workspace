public class Flag {
    String country;
    String colors;
    String design;
    double aspectRatio; 

    public static void main(String[] args) {
        Flag flag1 = new Flag();
        flag1.country = "USA";
        flag1.colors = "Red, White, Blue";
        flag1.design = "Stars and Stripes";
        flag1.aspectRatio = 1.9; 

        Flag flag2 = new Flag();
        flag2.country = "Canada";
        flag2.colors = "Red, White";
        flag2.design = "Maple Leaf";
        flag2.aspectRatio = 2.0;

        Flag flag3 = new Flag();
        flag3.country = "France";
        flag3.colors = "Blue, White, Red";
        flag3.design = "Vertical Tricolor";
        flag3.aspectRatio = 1.5;

        Flag flag4 = new Flag();
        flag4.country = "Japan";
        flag4.colors = "White, Red";
        flag4.design = "Red Circle";
        flag4.aspectRatio = 1.5;

        Flag flag5 = new Flag();
        flag5.country = "Germany";
        flag5.colors = "Black, Red, Gold";
        flag5.design = "Horizontal Tricolor";
        flag5.aspectRatio = 5.0 / 3.0; 

        Flag flag6 = new Flag();
        flag6.country = "Italy";
        flag6.colors = "Green, White, Red";
        flag6.design = "Vertical Tricolor";
        flag6.aspectRatio = 3.0 / 2.0; 

        Flag flag7 = new Flag();
        flag7.country = "Brazil";
        flag7.colors = "Green, Yellow, Blue, White";
        flag7.design = "Diamond and Circle";
        flag7.aspectRatio = 10.0 / 7.0; 

        Flag flag8 = new Flag();
        flag8.country = "India";
        flag8.colors = "Saffron, White, Green";
        flag8.design = "Horizontal Tricolor with Chakra";
        flag8.aspectRatio = 3.0 / 2.0; 

        Flag flag9 = new Flag();
        flag9.country = "Australia";
        flag9.colors = "Blue, White, Red";
        flag9.design = "Union Jack, Stars";
        flag9.aspectRatio = 2.0 / 1.0; 

        Flag flag10 = new Flag();
        flag10.country = "China";
        flag10.colors = "Red, Yellow";
        flag10.design = "Stars";
        flag10.aspectRatio = 3.0 / 2.0; 

        System.out.println("flag1 country:" + flag1.country);
        System.out.println("flag1 colors:" + flag1.colors);
        System.out.println("flag1 design:" + flag1.design);
        System.out.println("flag1 aspectRatio:" + flag1.aspectRatio);

        System.out.println("flag2 country:" + flag2.country);
        System.out.println("flag2 colors:" + flag2.colors);
        System.out.println("flag2 design:" + flag2.design);
        System.out.println("flag2 aspectRatio:" + flag2.aspectRatio);

        System.out.println("flag3 country:" + flag3.country);
        System.out.println("flag3 colors:" + flag3.colors);
        System.out.println("flag3 design:" + flag3.design);
        System.out.println("flag3 aspectRatio:" + flag3.aspectRatio);

        System.out.println("flag4 country:" + flag4.country);
        System.out.println("flag4 colors:" + flag4.colors);
        System.out.println("flag4 design:" + flag4.design);
        System.out.println("flag4 aspectRatio:" + flag4.aspectRatio);

        System.out.println("flag5 country:" + flag5.country);
        System.out.println("flag5 colors:" + flag5.colors);
        System.out.println("flag5 design:" + flag5.design);
        System.out.println("flag5 aspectRatio:" + flag5.aspectRatio);

        System.out.println("flag6 country:" + flag6.country);
        System.out.println("flag6 colors:" + flag6.colors);
        System.out.println("flag6 design:" + flag6.design);
        System.out.println("flag6 aspectRatio:" + flag6.aspectRatio);

        System.out.println("flag7 country:" + flag7.country);
        System.out.println("flag7 colors:" + flag7.colors);
        System.out.println("flag7 design:" + flag7.design);
        System.out.println("flag7 aspectRatio:" + flag7.aspectRatio);

        System.out.println("flag8 country:" + flag8.country);
        System.out.println("flag8 colors:" + flag8.colors);
        System.out.println("flag8 design:" + flag8.design);
        System.out.println("flag8 aspectRatio:" + flag8.aspectRatio);

        System.out.println("flag9 country:" + flag9.country);
        System.out.println("flag9 colors:" + flag9.colors);
        System.out.println("flag9 design:" + flag9.design);
        System.out.println("flag9 aspectRatio:" + flag9.aspectRatio);

        System.out.println("flag10 country:" + flag10.country);
        System.out.println("flag10 colors:" + flag10.colors);
        System.out.println("flag10 design:" + flag10.design);
        System.out.println("flag10 aspectRatio:" + flag10.aspectRatio);
    }
}