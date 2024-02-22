package DesignPattern.CreationalDesignPatterns.Factory.WaterBillGenerationService;

public class GetPlan {

    public Plan getPlan(String planType){
        if(planType ==null){
            return null;
        }else if(planType.equalsIgnoreCase(PlanType.DOMESTIC.name())){
            return new Domestic();
        }else if(planType.equalsIgnoreCase(PlanType.COMMERCIAL.name())){
            return new Commercial();
        }else if(planType.equalsIgnoreCase(PlanType.INSTITUTIONAL.name())){
            return new Institutional();
        }
        return null;
    }

}
