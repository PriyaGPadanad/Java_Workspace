class PostRunner {
    public static void main(String[] args) {
        String customerName = "John Doe";
        String address = "123 Main Street, Cityville";

        System.out.println("PostRunner starts the mail delivery process.");
        AreaPostOffice.deliver(customerName, address);
    }
}