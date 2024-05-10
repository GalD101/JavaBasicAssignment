// 322558297 Gal Dali

/**
 * This class calculates the sum of the digits of a given number.
 */
public class SumOfInteger {
    /**
     * Checks if the argument supplied is valid
     * and prints the sum of the digits of the given number.
     *
     * @param args the array of arguments sent by the user
     *             representing the number the user chose
     */
    public static void main(String[] args) {

        // Accept one and only one argument.
        if (args.length != 1) {
            System.out.println("Invalid input");
            return;
        }

        String num = args[0];

        // Remove prepending minus/plus sign (still a valid number).
        while ((num.charAt(0) == '-') || (num.charAt(0) == '+')) {
            num = num.substring(1, num.length());
        }

        if (!isNumber(num)) {
            System.out.println("Invalid input");
            return;
        }

        System.out.println(recursiveSum(num));
    }

    /**
     * Calculates the sum of the digits of the given number (s).
     * s is represented as a string and is assumed to be valid
     *
     * @param s the string representing the number.
     * @return the sum of the digits in the number.
     */
    public static int recursiveSum(String s) {
        int firstDigit = (int) (s.charAt(0) - '0');
        if (s.length() == 1) {
            return firstDigit;
        }

        String sCut = s.substring(1, s.length());
        return recursiveSum(sCut) + firstDigit;
    }

    /**
     * Checks if the string s is in a valid integer representation.
     *
     * @param s the string representing the number.
     * @return true iff the string is an integer.
     */
    public static boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) < '0') || (s.charAt(i) > '9')) {
                return false;
            }
        }
        return true;
    }
}
