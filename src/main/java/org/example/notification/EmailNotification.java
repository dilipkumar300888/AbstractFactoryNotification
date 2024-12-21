package org.example.notification;

import org.example.NotificationType;
import org.example.template.NotificationTemplate;

public class EmailNotification extends Notification {
    private String sender;
    public EmailNotification(String recipient, String sender, NotificationTemplate template) {
        super(recipient, template);
        this.sender = sender;
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    @Override
    public void sendNotification() {
        System.out.println("Email sent to "+ getRecipient() + " from "+sender);
        System.out.println("Message: "+ getTemplate().getMessage());
    }

    public String getSender() {
        return sender;
    }
}
