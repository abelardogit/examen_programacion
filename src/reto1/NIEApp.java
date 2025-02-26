/*
NO EDITES ESTA CLASE
 */
package reto1;

public class NIEApp {
    public static void main(String[] args) {
        testNIE();
    }

    private static void testNIE() {
        boolean isNIE1Valid = Validator.isNIEValid(NIETest.NIE_VALIDO);
        boolean isNIE2Valid = Validator.isNIEValid(NIETest.NIE_NO_VALIDO);
        if (isNIE1Valid && !isNIE2Valid) {
            Output.passedTest();
        } else {
            Output.failedTest();
        }
    }
}
