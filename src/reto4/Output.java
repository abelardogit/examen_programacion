package reto4;

public class Output {
    public static final String OCCUPIED = "\u001B[31m";
    public static final String FREE = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    public static String freeRoom() {
        return FREE + "LIBRE" + RESET;
    }
    public static String occupiedRoom() {
        return OCCUPIED + "OCUPADA" + RESET;
    }
}
