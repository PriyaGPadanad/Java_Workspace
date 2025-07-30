class ChatRun {

    public static void main(String[] values) {

        String sender1 = "Alice";
        String recipient1 = "Bob";
        String message1 = "Hello, Bob!";

        Chat chat1 = new Chat(sender1, recipient1, message1);
        System.out.println("chat1 Sender:" +chat1.sender);  
		System.out.println("chat1 Recipient:" +chat1.recipient);
		System.out.println("chat1 Message:" +chat1.message);
		
        Chat chat2 = new Chat("Charlie", "David", "How are you?");
		System.out.println("chat2 Sender:" +chat2.sender);
		System.out.println("chat2 recipient:"+chat2.recipient);
        System.out.println("chat2 Message:" + chat2.message);

        Chat chat3 = new Chat("Eve", "Frank", "What's the plan?");
		System.out.println("chat3 Sender:" +chat3.sender);
		System.out.println("chat3 recipient:"+chat3.recipient);
        System.out.println("chat3 Message:" + chat3.message);

        Chat chat4 = new Chat("Grace", "Henry", "See you later!");
		System.out.println("chat4 Sender:" +chat4.sender);
		System.out.println("chat4 recipient:"+chat4.recipient);
        System.out.println("chat4 Message:" + chat4.message);


        Chat chat5 = new Chat("Ivy", "Jack", "Let's catch up.");
		System.out.println("chat5 Sender:" +chat5.sender);
		System.out.println("chat5 recipient:"+chat5.recipient);
        System.out.println("chat5 Message:" + chat5.message);

    }
}