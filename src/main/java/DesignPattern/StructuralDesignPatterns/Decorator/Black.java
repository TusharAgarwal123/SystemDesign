package DesignPattern.StructuralDesignPatterns.Decorator;

public class Black implements Color{
    @Override
    public void fill(){
        System.out.println("Black color");
    }
}
