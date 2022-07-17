package HW.task_002_json;

import HW.task_002_json.HWParser.HWParser;
import HW.task_002_json.HWParser.TextFileParser;

import java.io.*;

public class main {
    public static void main(String[] args) {
        // interface HWParser
        // class TextFileParser
        // interface HWConverter
        // class ToJSONConverter
        // interface HWPrinter
        // class PrintJSON

        /*
            вітянуть из файла массив строк построчно
            первая строка это ключи для значений из остальных строк (сохранить отдельно)
            создать класс для хранения данных из остальных строк new Person(name, age)
            каждый Person запихнуть в массив
        */

        String base = "./src/main/java/HW";
        File file = new File(base + "/task_002_json/file.txt");
        try {
            InputStream is = new FileInputStream(file);
            String [] strings = streamToStrArray(is);
            for (String string : strings) {
                System.out.println(string);
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
}
