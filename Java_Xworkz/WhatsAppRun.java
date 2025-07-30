class WhatsAppRun {

    public static void main(String[] values) {
        String sender1 = "Alice";
        String recipient1 = "Bob";
        String message1 = "Hi!";
        long timestamp1 = System.currentTimeMillis();

        WhatsAppChat chat1 = new WhatsAppChat(sender1, recipient1, message1, timestamp1);
        System.out.println("chat1 Sender:" + chat1.sender);
        System.out.println("chat1 Recipient:" + chat1.recipient);
        System.out.println("chat1 Message:" + chat1.message);
        System.out.println("chat1 Timestamp:" + chat1.timestamp);

        WhatsAppChat chat2 = new WhatsAppChat("Charlie", "David", "How are you?", System.currentTimeMillis());
        System.out.println("chat2 Sender:" + chat2.sender);
        System.out.println("chat2 Recipient:" + chat2.recipient);
        System.out.println("chat2 Message:" + chat2.message);
        System.out.println("chat2 Timestamp:" + chat2.timestamp);

        WhatsAppChat chat3 = new WhatsAppChat("Eve", "Frank", "Meeting at 3.", System.currentTimeMillis());
        System.out.println("chat3 Sender:" + chat3.sender);
        System.out.println("chat3 Recipient:" + chat3.recipient);
        System.out.println("chat3 Message:" + chat3.message);
        System.out.println("chat3 Timestamp:" + chat3.timestamp);

        WhatsAppChat chat4 = new WhatsAppChat("Grace", "Henry", "See you later!", System.currentTimeMillis());
        System.out.println("chat4 Sender:" + chat4.sender);
        System.out.println("chat4 Recipient:" + chat4.recipient);
        System.out.println("chat4 Message:" + chat4.message);
        System.out.println("chat4 Timestamp:" + chat4.timestamp);

        WhatsAppChat chat5 = new WhatsAppChat("Ivy", "Jack", "Coffee?", System.currentTimeMillis());
        System.out.println("chat5 Sender:" + chat5.sender);
        System.out.println("chat5 Recipient:" + chat5.recipient);
        System.out.println("chat5 Message:" + chat5.message);
        System.out.println("chat5 Timestamp:" + chat5.timestamp);
    }
}