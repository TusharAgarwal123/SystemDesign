package DesignPattern.CreationalDesignPatterns.Factory.WaterBillGenerationService;

public class Domestic extends Plan {

    @Override
    void getRate() {
        rate = 5;
    }
}
