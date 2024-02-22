package DesignPattern.StructuralDesignPatterns.Bridge;

// Concrete Abstraction
class LongView extends View {
    public LongView(IResource resource) {
        super(resource);
    }
    public void show() {
        resource.snippet();
    }
}
