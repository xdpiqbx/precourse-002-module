package ua.goit.mod_009.lesson_006_enum.ByIvanMelnychuk;

public class FruitClass {
    private String name;
    public static final FruitClass apple = new FruitClass("apple");
    public static final FruitClass banana = new FruitClass("banana");
    public static final FruitClass mango = new FruitClass("mango");

    private FruitClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static void main(String[] args) {
        System.out.println(FruitClass.apple);
    }
}
