package DesignPattern.CreationalDesignPatterns.Factory.NotificationService;

public class NotificationServices {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        Notification notification1 = notificationFactory.createNotification("SMS");
        Notification notification2 = notificationFactory.createNotification("EMAIL");

        notification1.userNotification();
        notification2.userNotification();
    }
}
