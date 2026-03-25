package structural.bridge;

public class MacBookPro extends Laptop {
    public MacBookPro(OS os) { super(os); }
    public void showDetails() { System.out.print("MacBook Pro: "); os.run(); }
}
