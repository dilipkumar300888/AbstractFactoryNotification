package org.example;

import org.example.notification.Notification;
import org.example.sender.NotificationSender;
import org.example.template.NotificationTemplate;

public abstract class NotificationFactory {
    public abstract NotificationType notificationType();
    public abstract Notification createNotification(String recipient, String sender, NotificationTemplate template);
    public abstract NotificationSender createNotificationSender(Notification notification);
    public abstract NotificationTemplate createNotificationTemplate(String message);
}
