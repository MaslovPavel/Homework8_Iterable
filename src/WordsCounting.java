import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsCounting {
    public static void main(String[] args) {
        String text = "The block names supported by Pattern are the valid block names accepted and defined by Unicode";
        Map<String, Integer> wordMap = new HashMap<>();
        wordMap = WordsCounting.countWordsInString(text);
        for (String s : wordMap.keySet()) {
            System.out.println(s);
            System.out.println(wordMap.get(s));
        }
    }





    public static Map<String, Integer> countWordsInString(String input) {
        String regex = "(\\w+)";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        Map<String, Integer> wordMap = new HashMap<>();
        while (m.find()){
            if (!wordMap.containsKey(m.group(0).toLowerCase())){
                wordMap.put(m.group(0).toLowerCase(), 1);
            } else {
                wordMap.put(m.group(0).toLowerCase(), wordMap.get(m.group(0).toLowerCase()) + 1);
            }
        }
        return wordMap;
    }


}
