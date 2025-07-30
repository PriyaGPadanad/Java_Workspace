public class Camera {
    String brand;
    int megapixels;
    String model;
    double price;

    public static void main(String[] args) {
        Camera camera1 = new Camera();
        camera1.brand = "Canon";
        camera1.megapixels = 24;
        camera1.model = "EOS R6 Mark II";
        camera1.price = 2499.99;
		
		Camera camera2 = new Camera();
        camera2.brand = "Sony";
        camera2.megapixels = 33;
        camera2.model = "Alpha 7 IV";
        camera2.price = 2699.99;

        Camera camera3 = new Camera();
        camera3.brand = "Nikon";
        camera3.megapixels = 45;
        camera3.model = "Z9";
        camera3.price = 5499.99;

        Camera camera4 = new Camera();
        camera4.brand = "Fujifilm";
        camera4.megapixels = 26;
        camera4.model = "X-T4";
        camera4.price = 1699.99;

        Camera camera5 = new Camera();
        camera5.brand = "Panasonic";
        camera5.megapixels = 20;
        camera5.model = "GH5 II";
        camera5.price = 1499.99;

        Camera camera6 = new Camera();
        camera6.brand = "Olympus";
        camera6.megapixels = 20;
        camera6.model = "OM-D E-M1 Mark III";
        camera6.price = 1799.99;

        Camera camera7 = new Camera();
        camera7.brand = "Leica";
        camera7.megapixels = 47;
        camera7.model = "Q2";
        camera7.price = 5999.99;

        Camera camera8 = new Camera();
        camera8.brand = "Pentax";
        camera8.megapixels = 36;
        camera8.model = "K-1 Mark II";
        camera8.price = 1999.99;

        Camera camera9 = new Camera();
        camera9.brand = "Sigma";
        camera9.megapixels = 61;
        camera9.model = "fp L";
        camera9.price = 2499.99;

        Camera camera10 = new Camera();
        camera10.brand = "Hasselblad";
        camera10.megapixels = 100;
        camera10.model = "X1D II 50C";
        camera10.price = 5750.00;


        System.out.println("camera1 brand:" +camera1.brand);
		System.out.println("camera1 megapixels:" +camera1.megapixels);
		System.out.println("camera1 model:"+camera1.model);
		System.out.println("camera1.price:" +camera1.price);
		
		System.out.println("camera2 brand:" +camera2.brand);
		System.out.println("camera2 megapixels:" +camera2.megapixels);
		System.out.println("camera2 model:"+camera2.model);
		System.out.println("camera2.price:" +camera2.price);
		
		System.out.println("camera3 brand:" +camera3.brand);
		System.out.println("camera3 megapixels:" +camera3.megapixels);
		System.out.println("camera3 model:"+camera3.model);
		System.out.println("camera3.price:" +camera3.price);
		
		System.out.println("camera4 brand:" +camera4.brand);
		System.out.println("camera4 megapixels:" +camera4.megapixels);
		System.out.println("camera4 model:"+camera4.model);
		System.out.println("camera4.price:" +camera4.price);
		
		System.out.println("camera5 brand:" +camera5.brand);
		System.out.println("camera5 megapixels:" +camera5.megapixels);
		System.out.println("camera5 model:"+camera5.model);
		System.out.println("camera5.price:" +camera5.price);
		
		System.out.println("camera6 brand:" +camera6.brand);
		System.out.println("camera6 megapixels:" +camera6.megapixels);
		System.out.println("camera6 model:"+camera6.model);
		System.out.println("camera6.price:" +camera6.price);
		
		System.out.println("camera7 brand:" +camera7.brand);
		System.out.println("camera7 megapixels:" +camera7.megapixels);
		System.out.println("camera7 model:"+camera7.model);
		System.out.println("camera7.price:" +camera7.price);
		
		System.out.println("camera8 brand:" +camera8.brand);
		System.out.println("camera8 megapixels:" +camera8.megapixels);
		System.out.println("camera8 model:"+camera8.model);
		System.out.println("camera8.price:" +camera8.price);
		
		System.out.println("camera9 brand:" +camera9.brand);
		System.out.println("camera9 megapixels:" +camera9.megapixels);
		System.out.println("camera9 model:"+camera9.model);
		System.out.println("camera9.price:" +camera9.price);
		
		System.out.println("camera10 brand:" +camera10.brand);
		System.out.println("camera10 megapixels:" +camera10.megapixels);
		System.out.println("camera10 model:"+camera10.model);
		System.out.println("camera10.price:" +camera10.price);
    }
}