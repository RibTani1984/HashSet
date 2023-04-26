import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordChecker {
    Set<String> words = new HashSet<>();

    public WordChecker(String text) {
        Collections.addAll(this.words, text.split("\\P{IsAlphabetic}+"));
    }

    public boolean hasWord(String word) {
        if (words.contains(word)) {
            return true;
        }
        return false;
    }
}




