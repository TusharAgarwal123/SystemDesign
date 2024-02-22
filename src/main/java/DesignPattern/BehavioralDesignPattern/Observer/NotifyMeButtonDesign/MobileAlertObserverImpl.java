package DesignPattern.BehavioralDesignPattern.Observer.NotifyMeButtonDesign;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    private String mobileNo;
    private StockObserable stockObserable;

    MobileAlertObserverImpl(String mobileNo, StockObserable stockObserable){
        this.mobileNo = mobileNo;
        this.stockObserable = stockObserable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(mobileNo, "Product is in stock hurry up...");
    }

    private void sendMsgOnMobile(String mobileNo, String s) {
        System.out.println("Message Send to : "+mobileNo);
    }
}
