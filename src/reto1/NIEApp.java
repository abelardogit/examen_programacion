package reto1;

public class NIEApp {
    public static void main(String[] args) {
        testNIE();
    }

    private static void testNIE() {
        boolean isNIE1Valid = Validator.isNIEValid(NIETest.NIE_VALIDO);
        boolean isNIE2NotValid = Validator.isNIEValid(NIETest.NIE_NO_VALIDO);
        if (isNIE1Valid && isNIE2NotValid) {
            Output.passedTest();
        } else {
            Output.failedTest();
        }
    }
}
