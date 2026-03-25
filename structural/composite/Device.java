package structural.composite;

import java.util.ArrayList;
import java.util.List;

interface Item { void showPrice(); }

public class Device implements Item {
    private String name;
    public Device(String name) { this.name = name; }
    public void showPrice() { System.out.println(name + " cost: $1000"); }
}

