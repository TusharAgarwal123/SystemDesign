package DesignPattern.BehavioralDesignPattern.Strategy.Solution;

import DesignPattern.BehavioralDesignPattern.Strategy.MartialArt;

public class Judo extends MartialArt {

    KickStrategy kickStrategy;

    public Judo(KickStrategy kickStrategy){
        this.kickStrategy = kickStrategy;
    }

    void kick(){
        this.kickStrategy.kick();
    }

}
