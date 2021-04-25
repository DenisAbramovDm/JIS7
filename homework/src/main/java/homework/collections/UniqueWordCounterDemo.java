package homework.collections;

public class UniqueWordCounterDemo {
    public static void main(String[] args) {
        UniqueWordCounter wordCounter = new UniqueWordCounter();
        wordCounter.addWord("apple");
        wordCounter.addWord("pea");
        wordCounter.addWord("apple");
        wordCounter.addWord("berry");
        wordCounter.addWord("apple");
        wordCounter.addWord("brush");
        wordCounter.addWord("apple");
        wordCounter.addWord("brush");
        System.out.println(wordCounter.getMostFrequentWord());
        wordCounter.printWordsFrequency();
    }
}
