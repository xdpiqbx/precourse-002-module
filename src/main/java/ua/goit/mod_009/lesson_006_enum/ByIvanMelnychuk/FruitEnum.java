package ua.goit.mod_009.lesson_006_enum.ByIvanMelnychuk;

// Simple standard enum
//public enum FruitEnum {
//    apple, banana, mango;
//
//    public static void main(String[] args) {
//        System.out.println(FruitEnum.apple);
//    }
//}

// Custom enum
public enum FruitEnum {
    apple(10), banana(20), mango(25);

    private int price;

    FruitEnum(int price){
        this.price = price;
    }

    public static void main(String[] args) {
        System.out.println(FruitEnum.apple);
        System.out.println(FruitEnum.apple.price);
    }
}