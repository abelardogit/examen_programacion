/*
NO EDITES ESTA CLASE
 */

package reto1;

import java.util.HashMap;

public class NIEDB {
    private static HashMap<Integer, Character> db = null;
    private static final Character WRONG_DATA = '-';
    static {
        db = new HashMap<>();
        db.put(0, 'T');
        db.put(1, 'R');
        db.put(2, 'W');
        db.put(3, 'A');
        db.put(4, 'G');
        db.put(5, 'M');
        db.put(6, 'Y');
        db.put(7, 'F');
        db.put(8, 'P');
        db.put(9, 'D');
        db.put(10, 'X');
        db.put(11, 'B');
        db.put(12, 'N');
        db.put(13, 'J');
        db.put(14, 'Z');
        db.put(15, 'S');
        db.put(16, 'Q');
        db.put(17, 'V');
        db.put(18, 'H');
        db.put(19, 'L');
        db.put(20, 'C');
        db.put(21, 'K');
        db.put(22, 'E');
    }

    public static Character getLetter(int number) {
        if (!db.containsKey(number)) {
            return WRONG_DATA;
        }

        return db.get(number);
    }

}
