package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class IconFactory {
    private static Map<String, AppIcon> icons = new HashMap<>();
    public static AppIcon getIcon(String name) {
        if (!icons.containsKey(name)) icons.put(name, new AppIcon(name));
        return icons.get(name);
    }
}