package HW.task_003_words_freequancy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class main {
    public static void main(String[] args) {
        String base = "./src/main/java/HW/task_003_words_freequancy";
        File inputTXT = new File(base + "/file.txt");
        try(InputStream inpStrmTxtFile = new FileInputStream(inputTXT)){

            String [] strings = streamToStrArray(inpStrmTxtFile);
            List<String> wordsList = stringsToSortedWordsList(strings);
            Map<String, Integer> wordMap = wordsListToMapWordsCount(wordsList);
            Map<String, Integer> sortedMap = sortMapByValue(wordMap, false);

            for (String key : sortedMap.keySet()) {
                System.out.println(key+" "+sortedMap.get(key));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    private static String [] streamToStrArray(InputStream fileInputStream) throws IOException {
        byte[] buffer = fileInputStream.readAllBytes();
        StringBuilder sb = new StringBuilder();
        for (byte b : buffer) {
            sb.append((char) b);
        }
        return sb.toString().split("\n");
    }
    private static List<String> stringsToSortedWordsList(String [] strings){
        List<String> wordsList = new ArrayList<>();
        for (String string : strings) {
            String [] words = string.split(" ");
            for (String word : words) {
                wordsList.add(word.strip());
            }
        }
        Collections.sort(wordsList);
        return wordsList;
    }
    private static Map<String, Integer> wordsListToMapWordsCount(List<String> wordsList){
        int wordCounter = 0;
        String firstWord = wordsList.get(0);
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : wordsList) {
            if(firstWord.equals(word)){
                wordCounter++;
            }else{
                wordCounter = 1;
                firstWord = word;
            }
            wordMap.put(firstWord, wordCounter);
        }
        return wordMap;
    }
    private static Map<String, Integer> sortMapByValue(Map<String, Integer> map, boolean order){
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (order) {
                    return o1.getValue().compareTo(o2.getValue());
                } else {
                    return o2.getValue().compareTo(o1.getValue());
                }
            }
        });
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list){
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}
