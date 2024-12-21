package org.example;

import org.example.notification.Notification;
import org.example.sender.NotificationSender;
import org.example.template.NotificationTemplate;

public class TestAbstractFactory {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new EmailNotificationFactory();
        NotificationTemplate notificationTemplate = notificationFactory.createNotificationTemplate("Hi dude");
        Notification notification = notificationFactory.createNotification("Jithin", "Dilip",notificationTemplate);
        NotificationSender notificationSender = notificationFactory.createNotificationSender(notification);
        notificationSender.send();

        NotificationFactory notificationFactory2 = new PushNotificationFactory();
        NotificationTemplate notificationTemplate2 = notificationFactory2.createNotificationTemplate("Dilip");
        Notification notification1 = notificationFactory2.createNotification("Jithin", "Dilip",notificationTemplate2);
        NotificationSender notificationSender2 = notificationFactory2.createNotificationSender(notification1);
        notificationSender2.send();
    }
}
