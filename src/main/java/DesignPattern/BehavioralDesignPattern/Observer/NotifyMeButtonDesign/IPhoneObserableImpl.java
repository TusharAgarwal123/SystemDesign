package DesignPattern.BehavioralDesignPattern.Observer.NotifyMeButtonDesign;

import DesignPattern.BehavioralDesignPattern.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObserableImpl implements StockObserable{

    private List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();
    private static int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        notificationAlertObserverList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        notificationAlertObserverList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver notificationAlertObserver: notificationAlertObserverList){
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setStockCount(int count) {
        if(stockCount==0){
            notifySubscribers();
        }
        stockCount+=count;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
