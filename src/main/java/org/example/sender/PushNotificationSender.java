package org.example.sender;

import org.example.NotificationType;
import org.example.notification.Notification;

public class PushNotificationSender extends NotificationSender {

    public PushNotificationSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Sending push notification to " + getNotification().getRecipient());
        getNotification().sendNotification();
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}
