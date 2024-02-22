package DesignPattern.StructuralDesignPatterns.Decorator.Pizza;

import javax.swing.plaf.basic.BasicEditorPaneUI;

public class ExtraCheese extends ToppingDecorator{

    private BasePizza basePizza;

    ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+10;
    }
}
