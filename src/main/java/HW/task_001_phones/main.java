package HW.task_001_phones;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class main {
    public static void main(String[] args) {
        String base = "./src/main/java/HW/";
        File file = new File(base + "task_001_phones/file.txt");
        try(FileInputStream fileInputStream = new FileInputStream(file)) {
            String [] phones = streamToStrArray(fileInputStream);
            printValidPhones(phones);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    static String [] streamToStrArray (FileInputStream fileInputStream) throws IOException {
        byte[] buffer = fileInputStream.readAllBytes();
        StringBuilder sb = new StringBuilder();
        for (byte b : buffer) {
            sb.append((char) b);
        }
        return sb.toString().split("\n");
    }
    static void printValidPhones(String[] phones){
        for (String phone: phones) {
            if(isPhoneNumValid(phone)){
                System.out.println(phone);
            }
        }
    }
    static boolean isPhoneNumValid(String phone){
        String [] patterns = new String[]{
                "\\(\\d{3}\\) \\d{3}-\\d{4}", // (123) 456-7890
                "\\d{3}-\\d{3}-\\d{4}"        // 123-456-7890
        };
        for (String pattern: patterns) {
            if(phone.strip().matches(pattern)){
                return true;
            }
        }
        return false;
    }
}
