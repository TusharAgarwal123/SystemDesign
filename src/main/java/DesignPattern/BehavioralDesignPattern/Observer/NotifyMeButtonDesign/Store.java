package DesignPattern.BehavioralDesignPattern.Observer.NotifyMeButtonDesign;

public class Store {

    public static void main(String[] args) {
        StockObserable iPhoneObserable = new IPhoneObserableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@gmail.com",iPhoneObserable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc@gmail.com",iPhoneObserable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("1234567890",iPhoneObserable);

        iPhoneObserable.add(observer1);
        iPhoneObserable.add(observer2);
        iPhoneObserable.add(observer3);

        iPhoneObserable.setStockCount(10);
        iPhoneObserable.setStockCount(12);
    }
}
