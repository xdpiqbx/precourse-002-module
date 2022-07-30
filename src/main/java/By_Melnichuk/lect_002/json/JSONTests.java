package By_Melnichuk.lect_002.json;

import By_Melnichuk.lect_002.serialize.Contact;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSONTests {
    public static void main(String[] args) {
        Contact contact = new Contact();

        contact.setName("John");
        contact.setEmail("john@mail.com");
        contact.setPhone("093093093");
        contact.setAge(29);

        Contact contact1 = new Contact();

        contact1.setName("Bill");
        contact1.setEmail("bill@mail.com");
        contact1.setPhone("067067067");
        contact1.setAge(25);

        Contact [] contacts = new Contact[]{contact, contact1};

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String resJson = gson.toJson(contacts);
        System.out.println(resJson);

        Contact [] result = gson.fromJson(resJson, Contact[].class);

        for (Contact cnt : result) {
            System.out.println("cnt = " + cnt);
        }
    }
}
