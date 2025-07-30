class WhatsAppChat {

    String sender;
    String recipient;
    String message;
    long timestamp;

    public WhatsAppChat(String sender, String recipient, String message, long timestamp) {
        this.sender = sender;
        this.recipient = recipient;
        this.message = message;
        this.timestamp = timestamp;
        System.out.println();
    }
}