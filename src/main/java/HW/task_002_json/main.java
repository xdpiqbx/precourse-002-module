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
