package DesignPattern.StructuralDesignPatterns.Bridge;

// Concrete Implementor 2
class Album implements IResource {
    @Override
    public void snippet() {
        System.out.println("Hola !!!, This is my Album Description ...");
    }
}
