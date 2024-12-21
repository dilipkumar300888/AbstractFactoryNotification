package org.example.notification;

import org.example.NotificationType;
import org.example.template.NotificationTemplate;

public class PushNotification extends Notification {

    public PushNotification(String recipient, NotificationTemplate template) {
        super(recipient, template);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending push notification " + getRecipient());
        System.out.println("Message: "+ getTemplate().getMessage());
    }
}
