package DesignPattern.StructuralDesignPatterns.Composite;

public abstract class UniverseComponent {

    String getName(){
        throw new UnsupportedOperationException();
    }

    String getType(){
        throw new UnsupportedOperationException();
    }

    UniverseComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    void addChild(UniverseComponent universeComponent){
        throw new UnsupportedOperationException();
    }

    void removeChild(UniverseComponent universeComponent){
        throw new UnsupportedOperationException();
    }

    void print(){
        throw new UnsupportedOperationException();
    }
}
