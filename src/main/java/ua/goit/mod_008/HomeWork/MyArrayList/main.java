package ua.goit.mod_008.HomeWork.MyArrayList;

/*
- `add(Object value)` добавляет элемент в конец
- `remove(int index)` удаляет и возвращает элемент под индексом
- `clear()` очищает коллекцию (залишиться порожній масив [])
- `size()` возвращает размер коллекции array.length()
- `get(int index)` возвращает элемент под индексом
*/

public class main {
    public static void main(String[] args) {
        MyArrayList<String> nums = new MyArrayList<>();
        nums.add("zero");
        nums.add("one");
        nums.add("two");
        nums.add("three");
        nums.add("four");

        System.out.println(nums.remove(2));
        System.out.println(nums.size());
        System.out.println(nums.get(2));
        System.out.println(nums);
        nums.clear();
        System.out.println(nums);
    }
}
