package DesignPattern.BehavioralDesignPattern.Observer.WheatherStation;

public class TvDisplayObserver implements DisplayObserver{

    private WSObserable wsObserable;

    TvDisplayObserver(WSObserable wsObserable){
        this.wsObserable = wsObserable;
    }

    @Override
    public void update() {
        int temp = wsObserable.getData();
        System.out.println("TvDisplayObserver: with data "+temp);
    }
}
