package homework.collections;

public class UniqueWordVocabularyDemo {
    public static void main(String[] args) {
        UniqueWordVocabulary vocabulary = new UniqueWordVocabulary();
        vocabulary.addWord("wax");
        vocabulary.addWord("one");
        vocabulary.addWord("bax");
        vocabulary.addWord("");
        vocabulary.addWord("wax");
        vocabulary.addWord("   ");
        vocabulary.addWord("wax");
        vocabulary.addWord(null);
        System.out.println(vocabulary.getWordsCount());
        vocabulary.printVocabulary();
    }
}
