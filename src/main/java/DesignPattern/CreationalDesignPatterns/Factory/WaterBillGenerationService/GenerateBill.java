package DesignPattern.CreationalDesignPatterns.Factory.WaterBillGenerationService;

public class GenerateBill {
    public static void main(String[] args) {
        GetPlan plan =new GetPlan();

        String planType1 = "DOMESTIC";
        int unit = 6;

        Plan domesticPlan = plan.getPlan(planType1);
        domesticPlan.getRate();
        domesticPlan.calculateBill(unit);


        String planType2 = "COMMERCIAL";

        Plan commercialPlan = plan.getPlan(planType2);
        commercialPlan.getRate();
        commercialPlan.calculateBill(unit);

        for(PlanType type: PlanType.values()){
            System.out.println(type);
        }

    }
}
