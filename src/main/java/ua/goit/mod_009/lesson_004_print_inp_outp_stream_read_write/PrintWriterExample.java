package ua.goit.mod_009.lesson_004_print_inp_outp_stream_read_write;

import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) {
        try(PrintWriter writer = new PrintWriter(System.out)){
            writer.println("Hello");
            writer.println("World");
        }
    }
}
