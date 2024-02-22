package DesignPattern.CreationalDesignPatterns.Factory.NotificationService;

public class Email implements Notification {
    @Override
    public void userNotification() {
        System.out.println("Email notification sent!");
    }
}
