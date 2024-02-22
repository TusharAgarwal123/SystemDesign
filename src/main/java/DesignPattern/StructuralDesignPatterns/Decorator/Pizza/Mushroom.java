package DesignPattern.StructuralDesignPatterns.Decorator.Pizza;

public class Mushroom extends ToppingDecorator{
    private BasePizza basePizza;

    Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+15;
    }
}
