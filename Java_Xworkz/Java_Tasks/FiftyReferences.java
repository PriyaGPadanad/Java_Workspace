public class FiftyReferences {
    public static void main(String[] args) {
        String[] items = new String[50];
        for (int i = 0; i < 50; i++) {
            items[i] = "Item " + (i + 1);
        }
        System.out.println("50 References:");
        for (String item : items) {
            System.out.println(item);
        }
    }
}
