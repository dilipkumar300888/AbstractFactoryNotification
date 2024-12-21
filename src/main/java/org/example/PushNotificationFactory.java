package org.example;

import org.example.notification.Notification;
import org.example.notification.PushNotification;
import org.example.sender.NotificationSender;
import org.example.sender.PushNotificationSender;
import org.example.template.EmailNotificationTemplate;
import org.example.template.NotificationTemplate;

public class PushNotificationFactory extends NotificationFactory {

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public Notification createNotification(String recipient, String sender, NotificationTemplate template) {
        return new PushNotification(recipient, template);
    }

    @Override
    public NotificationSender createNotificationSender(Notification notification) {
        return new PushNotificationSender(notification);
    }

    @Override
    public NotificationTemplate createNotificationTemplate(String message) {
        return new EmailNotificationTemplate(message);
    }
}
