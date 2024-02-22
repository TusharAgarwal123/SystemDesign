package DesignPattern.StructuralDesignPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class StarCollection extends UniverseComponent {

    String name;
    String type;
    List<UniverseComponent> universeComponents; // A component can hold other components within it

    StarCollection(String name, String type) {
        this.name = name;
        this.type = type;
        this.universeComponents = new ArrayList<>();
    }

    String getName() {
        return this.name;
    }

    String getType() {
        return this.type;
    }

    UniverseComponent getChild(int i) {
        return universeComponents.get(i);
    }

    void addChild(UniverseComponent component) {
        universeComponents.add(component);
    }

    void removeChild(UniverseComponent component) {
        universeComponents.remove(component);
    }

    void print() {
        System.out.println(this.type + " = " + this.name);
        for (UniverseComponent component : this.universeComponents) {
            component.print();
        }
    }
}