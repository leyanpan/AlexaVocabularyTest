import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class VocabTester {
    private Map<String, String> EnglishToSpanish = new HashMap<>();
    private Map<String, String> SpanishToEnglish = new HashMap<>();


    public VocabTester(List<String> English, List<String> Spanish) {
        for (int i = 0; i < English.size(); i++) {
            this.EnglishToSpanish.put(English.get(i), Spanish.get(i));
            this.SpanishToEnglish.put(Spanish.get(i), English.get(i));
        }
    }

    public Map<String, String> getEnglishToSpanish() {
        return EnglishToSpanish;
    }

    public Map<String, String> getSpanishToEnglish() {
        return SpanishToEnglish;
    }

    public String getEnglish(String Spanish) {
        return this.SpanishToEnglish.get(Spanish);
    }

    public String getSpanish(String English) {
        return this.EnglishToSpanish.get(English);
    }

    public static void main(String[] args) {
        String[] EnglishWords = {"hello", "he", "she", "I", "you"};
        String[] SpanishWords = {"hola", "él", "ella", "yo", "tú"};
        List<String> English = new ArrayList<>();
        List<String> Spanish = new ArrayList<>();

        for (int i = 0; i < EnglishWords.length; i++) {
            English.add(EnglishWords[i]);
            Spanish.add(SpanishWords[i]);
        }

        VocabTester Tester1 = new VocabTester(English, Spanish);

        System.out.println(Tester1.getSpanish("he"));
        System.out.println(Tester1.getEnglish("ella"));

    }
}
