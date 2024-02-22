package DesignPattern.BehavioralDesignPattern.Observer.WheatherStation;

public class Client {
    public static void main(String[] args) {

        MobileDisplayObserver mobileDisplayObserver = new MobileDisplayObserver(new WSObserableImpl());
        TvDisplayObserver tvDisplayObserver = new TvDisplayObserver(new WSObserableImpl());

        WSObserableImpl wsObserable = new WSObserableImpl();

        wsObserable.attach(mobileDisplayObserver);
        wsObserable.attach(tvDisplayObserver);

        wsObserable.notifyAllObservers();

        wsObserable.detach(tvDisplayObserver);

        wsObserable.notifyAllObservers();

        wsObserable.setData(6);

    }
}
