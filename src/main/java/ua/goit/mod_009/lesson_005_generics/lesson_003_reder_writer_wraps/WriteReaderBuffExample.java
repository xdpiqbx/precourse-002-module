package ua.goit.mod_009.lesson_005_generics.lesson_003_reder_writer_wraps;

import java.io.*;

public class WriteReaderBuffExample {
    private static final String BASE_PATH = "D:\\JAVA\\GOIT\\005 Tech Skills (precourse)\\precourse-java-goit";
    private static final String PROJ_PATH = "\\src\\main\\resources\\WriteReaderExample\\WriteRead.txt";
    private static final String ABS_PATH = BASE_PATH + PROJ_PATH;

    public static void main(String[] args) {
        File file = new File(ABS_PATH);
        checkIsFileAvailable(file);

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
            bufferedWriter.write("Hello WriteReaderExample");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line = reader.readLine();
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static void checkIsFileAvailable(File file) {
        if(!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
