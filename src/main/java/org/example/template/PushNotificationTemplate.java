package org.example.template;

import org.example.NotificationType;

public class PushNotificationTemplate extends NotificationTemplate {

    public PushNotificationTemplate(String message) {
        super(message);
        applyTemplate();
    }

    @Override
    public String applyTemplate() {
        System.out.println("Applying push notification template");
        return getMessage();
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}
