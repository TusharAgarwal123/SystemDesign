package DesignPattern.BehavioralDesignPattern.Strategy.Solution;

public class FlyingKick implements KickStrategy{
    @Override
    public void kick() {
        // do flying kick
        System.out.println("Flying Kick...");
    }
}
