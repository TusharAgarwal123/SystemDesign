package DesignPattern.StructuralDesignPatterns.Bridge;

// Concrete Implementor 1
class Artist implements IResource {
    @Override
    public void snippet() {
        System.out.println("Artist's Snippet is here !!!");
    }
}
