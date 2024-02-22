package DesignPattern.BehavioralDesignPattern.Observer.WheatherStation;

import java.util.ArrayList;
import java.util.List;

public class WSObserableImpl implements WSObserable{

    private List<DisplayObserver> displayObserverList = new ArrayList<>();

    private static int temp = 5;

    @Override
    public void attach(DisplayObserver observer) {
        displayObserverList.add(observer);
    }

    @Override
    public void detach(DisplayObserver observer) {
        displayObserverList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for(DisplayObserver displayObserver: displayObserverList){
            displayObserver.update();
        }
    }

    @Override
    public void setData(int curTemp) {
        this.temp=curTemp;
        notifyAllObservers();
    }

    @Override
    public int getData() {
        return this.temp;
    }
}
