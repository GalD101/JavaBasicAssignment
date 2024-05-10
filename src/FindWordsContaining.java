// 322558297 Gal Dali

/**
 * This class provides methods to find words containing a specific character.
 */
public class FindWordsContaining {
    /**
     * Takes a list of words and character x
     * and prints only the words containing the character x.
     *
     * @param args the array of arguments supplied by the user
     *             representing words and character x.
     */
    public static void main(String[] args) {
        if ((args.length < 2) || (args[args.length - 1].length() != 1)) {
            System.out.println("Invalid input");
            return;
        }

        String[] words = new String[args.length - 1];
        char x = args[args.length - 1].charAt(0);
        for (int i = 0; i < words.length; i++) {
            words[i] = args[i];
        }

        for (String word : words) {
            if (containChar(word, x)) {
                System.out.println(word);
            }
        }
    }

    /**
     * Checks if the string word contains the given character x.
     *
     * @param word the string to examine.
     * @param x    the character to look for.
     * @return whether the word contains the character x.
     */
    public static boolean containChar(String word, char x) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == x) {
                return true;
            }
        }
        return false;
    }
}
