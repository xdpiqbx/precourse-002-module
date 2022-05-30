package ua.goit.mod_009.HW;

import java.util.Locale;

public class ExonNames {
    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }

    public boolean isNameLucky(String name) {
        String lowerCaseName = name.toLowerCase();
        return lowerCaseName.contains("a") || lowerCaseName.contains("o");
    }

    public String getNameCode(String name){
        return (name.substring(0, 1) + name.substring(name.length()-1, name.length())).toUpperCase();
    }

    public boolean isMoneyName(String name){
        char first = name.charAt(0);
        char last = name.charAt(name.length() - 1);

        boolean isDigit1 = first >= '0' && first <= '9';
        boolean isDigit2 = last >= '0' && last <= '9';

        return isDigit1 && isDigit2;
    }

    public String makeNamePositive(String name){
        if(!name.toLowerCase().contains("no")){
            return name;
        }
        name = name.toLowerCase();
        name = name.replace("no", "yes");
        name = name.toUpperCase();
        return name.charAt(0) + name.substring(1, name.length()).toLowerCase();
    }

    public String makeHalfOfName(String name){
        return name.substring(0, name.length() / 2);
    }

    //Test output
    public static void main(String[] args) {
        ExonNames names = new ExonNames();

        //Should be true
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);

        //Should be "exor BIGO"
        String fullName = names.makeFullName("exor", "bigo");
        System.out.println("names.makeFullName(\"exor\", \"bigo\") = " + fullName);

        //Should be true
        boolean isNameLucky = names.isNameLucky("Bigo");
        System.out.println("names.isNameLucky(\"Bigo\") = " + isNameLucky);

        //Should be BA
        String nameCode = names.getNameCode("boRA");
        System.out.println("names.getNameCode(\"boRA\") = " + nameCode);

        //Should be true
        boolean isMoneyName = names.isMoneyName("A1Boss31");
        System.out.println("names.isMoneyName(\"A1Boss31\") = " + isMoneyName);

        //Should be YesMont
        String positive = names.makeNamePositive("NoMont");
        System.out.println("names.makeNamePositive(\"NoMont\") = " + positive);
    }
}