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

        for (String arg : args) {
            if (!arg.matches("^[+-]?\\d+$")) {
                System.out.println("Invalid input");
                return;
            }
        }

        int[] nums = new int[args.length - 1];
        int target;
        try {
            target = Integer.parseInt(args[args.length - 1]);
            for (int i = 0; i < args.length - 1; i++) {
                nums[i] = Integer.parseInt(args[i]);
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
}
