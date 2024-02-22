package DesignPattern.BehavioralDesignPattern.Strategy.Solution;

import DesignPattern.BehavioralDesignPattern.Strategy.MartialArt;

public class KungFu extends MartialArt {

    KickStrategy kickStrategy;

    public KungFu(KickStrategy kickStrategy){
        this.kickStrategy = kickStrategy;
    }

    void kick(){
        this.kickStrategy.kick();
    }
}
