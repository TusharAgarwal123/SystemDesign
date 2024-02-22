package DesignPattern.BehavioralDesignPattern.Observer.WheatherStation;

public class MobileDisplayObserver implements DisplayObserver{

    private WSObserable wsObserable;

    MobileDisplayObserver(WSObserable wsObserable){
        this.wsObserable = wsObserable;
    }

    @Override
    public void update() {
        int temp = wsObserable.getData();
        System.out.println("MobileDisplayObserver: with data "+temp);
    }
}
