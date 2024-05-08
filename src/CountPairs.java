// 322558297 Gal Dali
public class CountPairs {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Invalid input");
            return;
        }
        // TODO check validity!!
        int [] nums = new int[args.length - 1];
        int target = Integer.parseInt(args[args.length - 1]);
        for (int i = 0; i < args.length - 1; i++) { nums[i] = Integer.parseInt(args[i]); }

        int numOfPairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
//                if (i == j) { continue; }
                int sum = nums[i] + nums[j];
                if (sum < target) { numOfPairs++; }
            }
        }
        System.out.println(numOfPairs);
    }
}
