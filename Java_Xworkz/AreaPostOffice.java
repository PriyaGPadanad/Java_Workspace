class AreaPostOffice {
    public static void deliver(String customerName, String address) {
        System.out.println("Area Post Office starts delivery : " + customerName);
        SubRegionalPostOffice.deliver(customerName, address);
    }
}