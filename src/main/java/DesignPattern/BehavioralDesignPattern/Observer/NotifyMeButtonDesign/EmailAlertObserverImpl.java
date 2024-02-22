package DesignPattern.BehavioralDesignPattern.Observer.NotifyMeButtonDesign;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    private String emailId;
    private StockObserable stockObserable;

    EmailAlertObserverImpl(String emailId, StockObserable stockObserable){
        this.emailId = emailId;
        this.stockObserable = stockObserable;
    }

    @Override
    public void update() {
        sendMail(emailId, "Product is in stock hurry up...");
    }

    private void sendMail(String emailId, String msg) {
        System.out.println("Mail send to Email Id: "+emailId);
    }
}
