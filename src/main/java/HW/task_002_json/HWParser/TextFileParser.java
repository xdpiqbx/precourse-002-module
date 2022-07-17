package HW.task_002_json.HWParser;

import java.io.IOException;
import java.io.InputStream;

public class TextFileParser implements HWParser{
    @Override
    public String[] parse(InputStream fileInputStream) {
        try{
            String [] str = streamToStrArray(fileInputStream);
            for (String s : str) {
                String [] keyVal = s.split(" ");
                if(keyVal.length == 2){
                    return keyVal;
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return new String[0];
    }
    private String [] streamToStrArray (InputStream fileInputStream) throws IOException {
        byte[] buffer = fileInputStream.readAllBytes();
        StringBuilder sb = new StringBuilder();
        for (byte b : buffer) {
            sb.append((char) b);
        }
        return sb.toString().split("\n");
    }
}
