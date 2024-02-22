package DesignPattern.CreationalDesignPatterns.Factory.WaterBillGenerationService;

public class Institutional extends Plan {
    @Override
    void getRate() {
        rate = 5.50;
    }
}
