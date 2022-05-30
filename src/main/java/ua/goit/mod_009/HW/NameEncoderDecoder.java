package ua.goit.mod_009.HW;

public class NameEncoderDecoder {
    public String encode(String name){
        return "NOTFORYOU" + name
                .replace('e', '1')
                .replace('u', '2')
                .replace('i', '3')
                .replace('o', '4')
                .replace('a', '5') + "YESNOTFORYOU";
    }
    public String decode(String name){
        name = name
                .replace("YESNOTFORYOU", "")
                .replace('1', 'e')
                .replace('2', 'u')
                .replace('3', 'i')
                .replace('4', 'o')
                .replace('5', 'a')
                .replace("NOTFORYOU", "");
        if(name.length() == 0){
            return "NOTFORYOU";
        }
        return name;
    }
}
