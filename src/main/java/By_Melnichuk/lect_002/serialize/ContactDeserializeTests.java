package By_Melnichuk.lect_002.serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ContactDeserializeTests {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "./src/By_Melnichuk/lect_002/files/contact.bin";
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fis);

//        Object obj = objectInputStream.readObject();
//        System.out.println("obj.getClass() = " + obj.getClass());

        Contact contact = (Contact) objectInputStream.readObject();
        System.out.println(contact);
    }
}
