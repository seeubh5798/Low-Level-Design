package Main.Java.Org.Shubham.StructuralPatterns.FlyWeightPattern;

import java.util.HashMap;

public class BulletFactory {
    private static HashMap<String , BulletType> types = new HashMap<>();

    public static BulletType getBullettype(String color){
        if(!types.containsKey(color)){
            types.put(color, new BulletType(color));
        }

        return types.get(color);
    }

    static void changecolor(String oldcolor, String newcolor){
        types.get(oldcolor).setColor(newcolor);
    }
}
