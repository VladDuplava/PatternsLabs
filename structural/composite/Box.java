package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Item {
    private List<Item> items = new ArrayList<>();
    public void addItem(Item item) { items.add(item); }
    public void showPrice() {
        for (Item item : items) item.showPrice();
    }
}
