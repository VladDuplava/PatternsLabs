package structural.decorator;

public class RamUpgrade extends BaseMacBook {
    private LaptopConfig laptop;
    public RamUpgrade(LaptopConfig laptop) { this.laptop = laptop; }
    public String getDescription() { return laptop.getDescription() + ", 16GB RAM"; }
    public double getPrice() { return laptop.getPrice() + 200.0; }
}
