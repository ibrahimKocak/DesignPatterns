package CreationalDesignPatterns.Prototype.ColorPrototype;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {

    private static Map<String, Color> colorMap = new HashMap<>();

    static {

        colorMap.put("Blue", new Blue());
        colorMap.put("Black", new Black());
    }

    public static Color getColor(String color) {

        return colorMap.get(color);
    }

}
