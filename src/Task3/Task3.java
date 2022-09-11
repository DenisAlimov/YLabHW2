package Task3;

public class Task3 {
    public static void main(String[] args) {

        assert fuzzySearch("car", "ca6$$#_rtwheel"); // true
        assert fuzzySearch("cwhl", "cartwheel"); // true
        assert fuzzySearch("cwhee", "cartwheel"); // true
        assert fuzzySearch("cartwheel", "cartwheel"); // true
        assert !fuzzySearch("cwheeel", "cartwheel"); // false
        assert !fuzzySearch("lw", "cartwheel"); // false
    }

    static boolean fuzzySearch(String word, String letters) {
        int n = 0;
        int k = 0;

        outerLoop:
        for (int i = 0; i < word.length(); i++) {
            for (int j = n; j < letters.length(); j++) {
                if (word.charAt(i) == letters.charAt(j)) {
                    if (j < letters.length() - 1) {
                        n = j + 1;
                    }
                    k++;
                    if (j == letters.length() - 1)
                        break outerLoop;
                }
            }
        }
        return k == word.length();
    }
}
        /*
        Task3.Task3
            Реализовать функцию нечеткого поиска

                    fuzzySearch("car", "ca6$$#_rtwheel"); // true
                    fuzzySearch("cwhl", "cartwheel"); // true
                    fuzzySearch("cwhee", "cartwheel"); // true
                    fuzzySearch("cartwheel", "cartwheel"); // true
                    fuzzySearch("cwheeel", "cartwheel"); // false
                    fuzzySearch("lw", "cartwheel"); // false
         */