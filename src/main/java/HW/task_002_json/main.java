package HW.task_002_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        String base = "./src/main/java/HW/task_002_json";
        File inputTXT = new File(base + "/file.txt");
        File outputJSON = new File(base + "/user.json");
        try {
            InputStream inpStrmTxtFile = new FileInputStream(inputTXT);
            String [] rawStrings = streamToStrArray(inpStrmTxtFile);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String resJson = gson.toJson(getListOfUsers(rawStrings));

            writeStrToJSONFile(outputJSON, resJson);
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
    private static List<User> getListOfUsers(String [] rawStrings){
        List<User> users = new ArrayList<>();
        for (int i = 1; i < rawStrings.length; i++){
            users.add(new User(rawStrings[i].split(" ")));
        }
        return users;
    }
    private static void writeStrToJSONFile(File outputJSON, String resJson) throws IOException {
        OutputStream outStrmToJSON = new FileOutputStream(outputJSON);
        InputStream inpSreamBytes = new ByteArrayInputStream(resJson.getBytes());
        while(inpSreamBytes.available() > 0){
            outStrmToJSON.write(inpSreamBytes.read());
        }
        inpSreamBytes.close();
        outStrmToJSON.close();
    }
}
