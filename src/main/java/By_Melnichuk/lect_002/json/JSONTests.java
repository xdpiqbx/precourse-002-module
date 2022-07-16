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

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String resJson = gson.toJson(contact);
        System.out.println(resJson);

        Contact result = gson.fromJson(resJson, Contact.class);
        System.out.println("result = " + result);
    }
}
