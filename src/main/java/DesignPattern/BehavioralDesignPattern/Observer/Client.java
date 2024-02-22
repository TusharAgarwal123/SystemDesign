package DesignPattern.BehavioralDesignPattern.Observer;

public class Client {
    public static void main(String[] args){
        ObserverA a = new ObserverA();
        ObserverB b = new ObserverB();
        ObserverC c = new ObserverC();

        ConcreteSubject publisher = new ConcreteSubject();
        publisher.attach(a);
        publisher.attach(b);

        publisher.notify(new Message("First update\n"));

        publisher.attach(c);
        publisher.detach(b);
        publisher.notify(new Message("Second update\n"));

    }
}
