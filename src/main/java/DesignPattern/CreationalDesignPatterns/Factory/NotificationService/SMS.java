package DesignPattern.CreationalDesignPatterns.Factory.NotificationService;

public class SMS implements Notification {
    @Override
    public void userNotification() {
        System.out.println("SMS notification sent!");
    }
}
