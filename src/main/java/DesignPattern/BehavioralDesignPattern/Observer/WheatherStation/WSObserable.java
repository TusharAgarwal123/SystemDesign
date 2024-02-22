package DesignPattern.BehavioralDesignPattern.Observer.WheatherStation;

import DesignPattern.BehavioralDesignPattern.Observer.Message;
import DesignPattern.BehavioralDesignPattern.Observer.Observer;

public interface WSObserable {
    //call attach() to add observers to the observer list
    public void attach(DisplayObserver observer);

    //call detach() to remove observers from the observer list
    public void detach(DisplayObserver observer);

    //call notify() to publish all the changes made by the subject
    public void notifyAllObservers();

    public void setData(int temp);

    public int getData();

}
