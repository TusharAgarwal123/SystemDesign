package DesignPattern.BehavioralDesignPattern.Observer.NotifyMeButtonDesign;

import DesignPattern.BehavioralDesignPattern.Observer.Message;
import DesignPattern.BehavioralDesignPattern.Observer.Observer;

public interface StockObserable {

    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStockCount(int count);

    public int getStockCount();


}
