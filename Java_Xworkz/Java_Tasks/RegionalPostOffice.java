class RegionalPostOffice {
    public static void deliver(String customerName, String address) {
        System.out.println("Regional Post Office forwards delivery for: " + customerName);
        PostHeadMaster.deliver(customerName, address);
    }
}