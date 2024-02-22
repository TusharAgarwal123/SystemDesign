package DesignPattern.StructuralDesignPatterns.Composite;

public class Star extends UniverseComponent {

    String name;
    String type;

    Star(String name, String type){
        this.name = name;
        this.type = type;
    }

    String getName(){
        return this.name;
    }

    String getType(){
        return this.type;
    }

    void print(){
        System.out.println(this.type + " = " + this.name);
    }
}
