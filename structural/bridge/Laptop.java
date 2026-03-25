package structural.bridge;

public abstract class Laptop {
    protected OS os;
    protected Laptop(OS os) { this.os = os; }
    abstract void showDetails();
}
