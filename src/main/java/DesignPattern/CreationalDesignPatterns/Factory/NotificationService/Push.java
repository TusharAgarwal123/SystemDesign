package DesignPattern.CreationalDesignPatterns.Factory.NotificationService;

public class Push implements Notification {
    @Override
    public void userNotification() {
        System.out.println("Push notification sent!");
    }
}
