package sub;

import java.util.*;

public class DetectingAnagrams {

    /*Sherlock Holmes and the mystery of anagrams
               .
        In this problem, you are Sherlock Holmes and you want to quickly detect all anagrams.

        Write a program that finds out whether two words are anagrams or not. If one word is an anagram of another, print "yes", else print "no".

        Note: anagrams are words that contain the same characters with the same frequencies. In other words, anagrams are created by changing the order of letters in the word.

        For example:

                "ppaaagg" (2 ps, 3 as, 2 gs) and "gagaapp" (2 ps, 3 as, 2 gs) are anagrams;
                 "hello" (1 h, 1 e, 2 ls, 1 o) and "helllo" (1 h, 1 e, 3 ls, 1 o) are not anagrams.
                   Remember: anagrams are case-insensitive.*/

    //Alternative Solution
    private static Map<String, Integer> getCharCountMap(String word) {
        Map<String, Integer> wordMap = new HashMap<>();
        for (String c: word.toLowerCase(Locale.ROOT).split("")) {
             wordMap.putIfAbsent(c, 0);
             int num = wordMap.get(c);
             wordMap.put(c, ++num);
        }
        return wordMap;
    }

    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        System.out.println(getCharCountMap(sc.next()).equals(getCharCountMap(sc.next())) ? "yes" : "no");
    }


//        String word = sc.nextLine().toLowerCase(Locale.ROOT);
//        String word2 = sc.nextLine().toLowerCase(Locale.ROOT);
//
//        Map<String, Integer> wordMap = new HashMap<>();
//        Map<String, Integer> wordMap2 = new HashMap<>();
//
//        for (String c: word.split("")) {
//            wordMap.putIfAbsent(c, 0);
//            int num = wordMap.get(c);
//            wordMap.put(c, ++num);
//        }
//
//        for (String c: word2.split("")) {
//            wordMap2.putIfAbsent(c, 0);
//            int num = wordMap2.get(c);
//            wordMap2.put(c, ++num);
//        }
//
//        if(Objects.equals(wordMap, wordMap2)) {
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }
}
