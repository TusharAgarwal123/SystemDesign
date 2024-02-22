package DesignPattern.BehavioralDesignPattern.Strategy.Solution;

public class NormalKick implements KickStrategy{
    @Override
    public void kick(){
        // do kick
        System.out.println("Normal Kick...");
    }
}
