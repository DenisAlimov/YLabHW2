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
        if (word == null || letters == null || word.length() < 1 || letters.length() < word.length()) {
            return false;
        }
        int charIndex = 0;
        int charCounter = word.length();
        for (int i = 0; i < letters.length(); i++) {
            if (letters.charAt(i) == word.charAt(charIndex)) {
                charIndex++;
                charCounter--;
            }
            if (charCounter == 0) {
                return true;
            }
        }
        return false;
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