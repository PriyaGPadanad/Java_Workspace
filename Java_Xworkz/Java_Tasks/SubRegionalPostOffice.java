class SubRegionalPostOffice {
    public static void deliver(String customerName, String address) {
        System.out.println("Sub-Regional Post Office forwards delivery : " + customerName);
        RegionalPostOffice.deliver(customerName, address);
    }
}