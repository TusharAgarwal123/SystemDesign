package DesignPattern.BehavioralDesignPattern.Strategy.Solution;

public class NoKick implements KickStrategy{
    @Override
    public void kick() {
        // do nothing
        System.out.println("No Kick...");
    }
}
