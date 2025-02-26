package reto3;

import common.Appetizer;

import java.util.HashMap;

public class RateDB {
    private static final HashMap<String, Rate[]> db;
    private static final Rate[] WRONG_RATE = null;
    private static final String NORMAL = "Normal";
    private static final String PREMIUM = "Premium";
    static {

        db = new HashMap<>();

        db.put(NORMAL, new Rate[]{
                new Rate(45.0f, new Appetizer[]{
                        new Appetizer("Chocolatina", 3.50f),
                        new Appetizer("Botella de vino (1 L.)", 1.50f),
                        new Appetizer("Canapé", 4.50f),
                }),
        });
        db.put(PREMIUM, new Rate[]{
                new Rate(75.0f, new Appetizer[]{
                        new Appetizer("Chocolatina", 5.50f),
                        new Appetizer("Botella de vino (1 L.)", 5.0f),
                        new Appetizer("Canapé", 7.85f),
                }),
        });
    }

    public static Rate[] getRatesByCategory(String aCategory) {
        if (!db.containsKey(aCategory)) {
            return WRONG_RATE;
        }

        return db.get(aCategory);
    }
}
