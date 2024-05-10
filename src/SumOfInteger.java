// 322558297 Gal Dali
/**
 * This class calculates the sum of the digits of a given number.
 */
public class SumOfInteger {
    /**
     * Calculates the sum of the digits of the given number (s).
     * s is represented as a string and is assumed to be valid
     *
     * @param s  the string representing the number.
     * @return the sum of the digits in the number.
     */
    public static int recursiveSum(String s) {
        // TODO check validity of input! (Don't use try catch to determine flow!)
        char firstChar = s.charAt(0);
        if (s.length() == 1) {
            return (int)(firstChar - '0');
        }
        String sCut = s.substring(1);
        return recursiveSum(sCut) + (int)(firstChar - '0');
    }

    public static boolean isNumeric(String s) {
        // Remove prepending minus sign(s).
        if (s.length() == 0) { return false; }
        while ((s.charAt(0) == '-') || (s.charAt(0) == '+')) {
            s = s.substring(1);
        }

        // Make sure every character is a valid decimal digit.
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) < '0') || (s.charAt(i) > '9')) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if the argument supplied is valid
     * and prints the sum of the digits of the given number.
     * @param args  the array of arguments sent by the user
     *              representing the number the user chose
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Invalid input");
            return;
        }

        String num = args[0];
        if (!isNumeric(num)) {
            System.out.println("Invalid input");
            return;
        }

        while ((num.charAt(0) == '-') || (num.charAt(0) == '+')) {
            num = num.substring(1);
        }
        System.out.println(recursiveSum(num));
    }
}
