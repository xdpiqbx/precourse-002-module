package By_Melnichuk.lect_002.serialize;

import java.io.*;

public class ContactSerializeTests {
    public static void main(String[] args) throws IOException {
        Contact contact = new Contact();

        contact.setName("John");
        contact.setEmail("john@mail.com");
        contact.setPhone("093093093");
        contact.setAge(29);

        String path = "./src/By_Melnichuk/lect_002/files/contact.bin";

        OutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(contact);
        objectOutputStream.flush();
        fileOutputStream.close();
    }
}
