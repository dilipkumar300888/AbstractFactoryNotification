package org.example.sender;

import org.example.NotificationType;
import org.example.notification.Notification;

public abstract class NotificationSender {
    private final Notification notification;

    protected NotificationSender(Notification notification) {
        this.notification = notification;
    }
    public Notification getNotification() {
        return notification;
    }
    public abstract void send();

    public abstract NotificationType notificationType();
}
