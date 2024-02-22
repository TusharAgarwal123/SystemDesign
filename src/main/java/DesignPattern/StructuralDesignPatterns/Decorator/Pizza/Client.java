package DesignPattern.StructuralDesignPatterns.Decorator.Pizza;

public class Client {

    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese(new FarmHouse());
        System.out.println("Price of FarmHouse pizza with extra cheese topping : "+pizza.cost());

        BasePizza pizza2 = new Mushroom (new ExtraCheese(new VegDelight()));
        System.out.println("Price of VegDelight pizza with extra cheese and mushroom toppings : "+pizza2.cost());
    }
}
