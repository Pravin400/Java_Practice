package Interview_Coding_Questions;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> GroupAnagrams(String[] str) {
        Map<String, List<String>> map = new HashMap<>();

        for(String w : str){
            char[] arr = w.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(w);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String [] str = {"eat","tea","tan","ate","nat","bat"};
        System.out.println("Group Of Anagrams "+GroupAnagrams(str));
    }
}
