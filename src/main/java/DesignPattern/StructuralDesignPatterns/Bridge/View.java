package DesignPattern.StructuralDesignPatterns.Bridge;

// Abstraction
abstract class View {
    protected IResource resource;

    protected View(IResource resource){
        this.resource = resource;
    }
    public abstract void show();
}