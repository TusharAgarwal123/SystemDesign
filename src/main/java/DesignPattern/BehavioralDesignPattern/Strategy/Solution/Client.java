package DesignPattern.BehavioralDesignPattern.Strategy.Solution;

public class Client {

    public static void main(String[] args) {
        KungFu kungFu1 = new KungFu(new FlyingKick());
        kungFu1.kick(); // does flying kick

        KungFu kungFu = new KungFu(new NormalKick());
        kungFu.kick(); // does normal kick

        Judo judo = new Judo(new NoKick());
        judo.kick(); // does nothing
    }

}
