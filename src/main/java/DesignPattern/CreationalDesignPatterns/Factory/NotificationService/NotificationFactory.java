package DesignPattern.CreationalDesignPatterns.Factory.NotificationService;

public class NotificationFactory {
    public Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;

        if(channel == NotificationType.SMS.name())
            return new SMS();

        else if(channel == NotificationType.EMAIL.name())
            return new Email();

        else if(channel == NotificationType.PUSH.name())
            return new Push();

        else{
            throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }
}
