package homework.collections;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {
    Set<String> vocabulary = new HashSet<>();

    void addWord(String word) {
        if (word != "") {
            vocabulary.add(word);
        }
    }

    int getWordsCount() {
        return vocabulary.size();
    }

    void printVocabulary() {
        for (String word : vocabulary) {
            System.out.println(word);

        }
    }
}
