package org.example.sender;

import org.example.NotificationType;
import org.example.notification.Notification;

public class EmailNotificationSender extends NotificationSender {


    public EmailNotificationSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Sending email notification to "+ getNotification().getRecipient());
        getNotification().sendNotification();
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}
