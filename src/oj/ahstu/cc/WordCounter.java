package oj.ahstu.cc;

import java.util.Arrays;
import java.util.TreeMap;

/**
 * Created by c on 2017/7/24.
 */
public class WordCounter {
    public static void main(String[] args) {
        String text = "To know everything is to know   nothing.";
        String[] words = text.toLowerCase().replaceAll("t", "d").split("\\W+");
        System.out.println(Arrays.toString(words));
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                int prev = map.get(word);
                map.put(word, prev + 1);
            } else
                map.put(word, 1);
        }
        System.out.println(words.length);
        for(String key:map.keySet())
            System.out.println(key+":"+map.get(key));

    }
}
