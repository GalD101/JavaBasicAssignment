// 322558297 Gal Dali
public class SumOfInteger {
    // TODO Add documentation!
    public static int recursiveSum(String s) {
        // TODO check validity of input! (Don't use try catch to determine flow!)
        // Improve readability and clean code
        if (s.length() == 0) {
            return 0;
        }
        String sCut = s.substring(1, s.length());
        char firstChar = s.charAt(0);
        return recursiveSum(sCut) + Character.getNumericValue(firstChar);
    }
    public static void main(String[] args) {
        System.out.println(recursiveSum(args[0]));
    }
}
