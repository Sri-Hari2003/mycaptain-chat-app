package com.example.mycaptain2;

public class messages {
    String text;
    String senderId;
    String receiverId;
    String type;
    long time_delivered;
    long time_received;
    long time_sent;

    // Default constructor (optional but recommended)
    public messages() {}

    // Constructor with parameters
    public messages(String text, String senderId, String receiverId, String type, long time_delivered, long time_received, long time_sent) {
        this.text = text;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.type = type;
        this.time_delivered = time_delivered;
        this.time_received = time_received;
        this.time_sent = time_sent;
    }

    // Getters and Setters
    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSenderId() {
        return this.senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReceiverId() {
        return this.receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getTime_delivered() {
        return this.time_delivered;
    }

    public void setTime_delivered(long time_delivered) {
        this.time_delivered = time_delivered;
    }

    public long getTime_received() {
        return this.time_received;
    }

    public void setTime_received(long time_received) {
        this.time_received = time_received;
    }

    public long getTime_sent() {
        return this.time_sent;
    }

    public void setTime_sent(long time_sent) {
        this.time_sent = time_sent;
    }

    public static void main(String[] args) {
        // Create a messages object
        messages msg = new messages("Hello", "1", "2", "text", 100, 115, 100);

        // Access the fields using getters
        String messageText = msg.getText();
        String senderId = msg.getSenderId();
        String receiverId = msg.getReceiverId();
        String messageType = msg.getType();
        long timeDelivered = msg.getTime_delivered();
        long timeReceived = msg.getTime_received();
        long timeSent = msg.getTime_sent();

        // Print the values to check
        System.out.println("Message: " + messageText);
        System.out.println("Sender ID: " + senderId);
        System.out.println("Receiver ID: " + receiverId);
        System.out.println("Message Type: " + messageType);
        System.out.println("Time Delivered: " + timeDelivered);
        System.out.println("Time Received: " + timeReceived);
        System.out.println("Time Sent: " + timeSent);
    }
}
