package ua.goit.mod_009.lesson_004_print_inp_outp_stream_read_write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamExample {
        private static final String BASE_PATH = "E:\\java\\GOIT\\precourse";
        private static final String PROJ_PATH = "\\src\\main\\resources\\WriteReaderExample\\WriteRead.txt";
        private static final String ABS_PATH = BASE_PATH + PROJ_PATH;
//        private static final String BASE_PATH = "D:\\JAVA\\GOIT\\005 Tech Skills (precourse)\\precourse-java-goit";
//        private static final String PROJ_PATH = "\\src\\main\\resources\\WriteReaderExample\\WriteRead.txt";
//        private static final String ABS_PATH = BASE_PATH + PROJ_PATH;
    public static void main(String[] args) {
        File file = new File(ABS_PATH);
        checkIsFileAvailable(file);
//        try(PrintStream printStream = new PrintStream(new FileOutputStream(file))){
        try(PrintStream printStream = new PrintStream(file)){
            printStream.print("A");
            printStream.print('a');
            printStream.print(121);
            printStream.println();
            printStream.println();
            printStream.println();
            printStream.println("Some text");
            printStream.println("Some text");
            printStream.println("Some text");
        }catch (IOException e){
            System.err.println(e.getMessage());
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
