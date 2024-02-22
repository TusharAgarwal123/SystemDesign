package DesignPattern.CreationalDesignPatterns.Factory.WaterBillGenerationService;

public class Commercial extends Plan {
    @Override
    void getRate() {
        rate = 7.50;
    }
}
