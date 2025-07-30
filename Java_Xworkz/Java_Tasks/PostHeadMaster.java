class PostHeadMaster {
    public static void deliver(String customerName, String address) {
        System.out.println("PostHeadMaster processing delivery for: " + customerName);
        PostMaster.deliver(customerName, address);
    }
}