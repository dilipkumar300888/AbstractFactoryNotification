package org.example.template;

import org.example.NotificationType;

public class EmailNotificationTemplate extends NotificationTemplate {

    public EmailNotificationTemplate(String message) {
        super(message);
        applyTemplate();
    }

    @Override
    public String applyTemplate() {
        System.out.println("Applying email notification template");
        return getMessage();
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}
