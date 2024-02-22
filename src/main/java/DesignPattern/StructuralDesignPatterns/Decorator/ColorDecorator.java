package DesignPattern.StructuralDesignPatterns.Decorator;

public abstract class ColorDecorator implements Color{

    //base class object
    protected Color colored;

    //constructor with base class object as the parameter
    public ColorDecorator(Color colored){
        this.colored = colored;
    }

    public void fill(){
        colored.fill();
    }
}
