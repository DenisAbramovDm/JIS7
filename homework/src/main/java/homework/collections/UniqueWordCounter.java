package homework.collections;

import homework.methodsAndClasses.Encoder;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {
    private static final Logger log = Logger.getLogger(UniqueWordCounter.class);
    private Map<String, Integer> vocabulary = new HashMap<>();
    String word;
    Integer key;

    private boolean check(String word) {
        if (word != null && !word.isBlank()) {
            return true;
        } else return false;
    }

    public void addWord(String word) {
        if (check(word)) {
            if (vocabulary.containsKey(word)) {
                vocabulary.put(word, vocabulary.get(word) + 1);
            } else vocabulary.put(word, 1);
        }
    }
    private void printSome(String word){
        System.out.println(word);
    }
    public String getMostFrequentWord(){
        Integer maxFrequency = 0;
        String maxFrequentlyWord = "No elements";
        for (Map.Entry<String, Integer> iterator : vocabulary.entrySet()){
            if (iterator.getValue() > maxFrequency){
                maxFrequency = iterator.getValue();
                maxFrequentlyWord = iterator.getKey();
            }
        }
        return maxFrequentlyWord;
    }

    public void printWordsFrequency(){
        for (Map.Entry<String, Integer> iterator : vocabulary.entrySet()){
            log.info("The word " + iterator.getKey() +
                    " is occured " + iterator.getValue() +" times");
        }
    }

}
