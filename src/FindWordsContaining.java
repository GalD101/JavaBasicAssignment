// 322558297 Gal Dali
public class FindWordsContaining {
    public static boolean containChar(String word, char x) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == x) { return true; }
        }
        return false;
    }
    public static void main(String[] args) {
        if ((args.length < 2) || (args[args.length - 1].length() != 1)) {
            System.out.println("Invalid input");
            return;
        }
        // TODO check validity!!
        String [] words = new String[args.length - 1];
        for (int i = 0; i < words.length; i++) {
            words[i] = args[i];
        }

        char x = args[args.length - 1].charAt(0);
        for (int i = 0; i < words.length; i++) {
            if (containChar(words[i], x)) {
                System.out.println(words[i]);
            }
        }
    }
}
