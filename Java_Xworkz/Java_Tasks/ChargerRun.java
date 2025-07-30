class ChargerRun {

    public static void main(String[] values) {

        String brand1 = "Anker";
        String type1 = "USB-C";
        double voltage1 = 5.0;
		
		String brand2 = "Apple";
        String type2 = "Lightning";
        double voltage2 = 5.0;
		
		String brand3="Samsung";
		String type3="Micro-USB";
		double voltage3=5.0;
		
        Charger charger1 = new Charger(brand1, type1, voltage1);
        System.out.println("charger1 Brand:" + charger1.brand);
        System.out.println("charger1 Type:" + charger1.type);
        System.out.println("charger1 Voltage:" + charger1.voltage + "V");
		
        Charger charger2 = new Charger(brand2,type2,voltage2);
        System.out.println("charger2 Brand:" + charger2.brand);
        System.out.println("charger2 Type:" + charger2.type);
        System.out.println("charger2 Voltage:" + charger2.voltage + "V");

        Charger charger3 = new Charger(brand3,type3,voltage3);
        System.out.println("charger3 Brand:" + charger3.brand);
        System.out.println("charger3 Type:" + charger3.type);
        System.out.println("charger3 Voltage:" + charger3.voltage + "V");

        Charger charger4 = new Charger("Belkin", "USB-C", 9.0);
        System.out.println("charger4 Brand:" + charger4.brand);
        System.out.println("charger4 Type:" + charger4.type);
        System.out.println("charger4 Voltage:" + charger4.voltage + "V");

        Charger charger5 = new Charger("Generic", "USB-A", 5.0);
        System.out.println("charger5 Brand:" + charger5.brand);
        System.out.println("charger5 Type:" + charger5.type);
        System.out.println("charger5 Voltage:" + charger5.voltage + "V");
    }
}