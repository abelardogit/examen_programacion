/*
NO EDITES ESTA CLASE
 */
package reto1;

public class Output {
    public static final String TEST_MSG_KO = "\u001B[31m";
    public static final String TEST_MSG_OK = "\u001B[32m";
    public static final String RESET = "\u001B[0m";
    public static void passedTest() {
        System.out.println(TEST_MSG_OK + "Reto superado" + RESET);
    }
    public static void failedTest() {
        System.out.println(TEST_MSG_KO + "Reto NO superado. Intenta otra vez." + RESET);
    }
}
