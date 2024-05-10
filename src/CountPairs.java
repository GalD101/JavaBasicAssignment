// 322558297 Gal Dali

/**
 * This class counts pairs of integers from input arguments whose sum is less than a target value.
 */
public class CountPairs {
    /**
     * Counts pairs of integers from input arguments whose sum is less than a target value.
     *
     * @param args The array of integer arguments provided by the user.
     */
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Invalid input");
            return;
        }

        // Check input validity.
        for (String arg : args) {
            for (int i = 0; i < arg.length(); i++) {
                if (!isValidInteger(arg)) {
                    System.out.println("Invalid input");
                    return;
                }
            }
        }

        int[] nums = new int[args.length - 1];
        int target;
        String targetStr = removePrependingSigns(args[args.length - 1]);

        try {
            target = Integer.parseInt(targetStr);
            for (int i = 0; i < nums.length; i++) {
                nums[i] = Integer.parseInt(removePrependingSigns(args[i]));
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return;
        }

        int numOfPairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum < target) {
                    numOfPairs++;
                }
            }
        }

        System.out.println(numOfPairs);
    }

    /**
     * Checks if the string s is in a valid integer representation.
     *
     * @param str the string representing the number.
     * @return true iff the string is an integer.
     */
    public static boolean isValidInteger(String str) {
        while ((str.charAt(0) == '-') || (str.charAt(0) == '+')) {
            if (str.length() == 1) {
                return false;
            }
            str = str.substring(1, str.length());
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    /**
     * Removes all redundant plus/minus signs prepending the string.
     *
     * @param str the string representing the number.
     * @return the string representing the number only with
     * necessary prepending signs.
     */
    public static String removePrependingSigns(String str) {
        boolean isNeg = false;

        // Remove prepending minus/plus sign.
        while ((str.charAt(0) == '-') || (str.charAt(0) == '+')) {
            if (str.charAt(0) == '-') {
                isNeg = !isNeg;
            }
            str = str.substring(1, str.length());
        }

        return isNeg ? '-' + str : str;
    }
}
