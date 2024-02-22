package DesignPattern.BehavioralDesignPattern.Observer;

public interface Observer {
    //call update() to inform all the observers about the chnages in the subject
    public void update(Message m);
}
