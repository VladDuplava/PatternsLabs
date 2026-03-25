package structural.flyweight;

public class AppIcon { // Внутрішній стан (спільний)
    private String appName;
    public AppIcon(String appName) { this.appName = appName; }
    public void draw(int x, int y) { System.out.println("Drawing " + appName + " at " + x + "," + y); }
}
