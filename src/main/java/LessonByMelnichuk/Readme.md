# Модуль 11

## λ-выражения

```java
@FunctionalInterface
public interface HumanToIntegerTransformer {
    int transform(Human human);
}
```

```java
public class HumanToIntegerTransformerImpl implements HumanToIntegerTransformer {
    @Override
    public int transform(Human human) {
        return human.getSalary();
    }
}
```

### Step by step to lambda function

```java
    public class HumanToIntegerTransformerTests {
    public static void main(String[] args) {
        // Step 1 - interface + implementation
        Human john = new Human("John", 1000);
        HumanToIntegerTransformer transformer1 = new HumanToIntegerTransformerImpl();
        System.out.println("transformer.transform1(john) = " + transformer1.transform(john));

        // Step 2 - Anonimous class
        HumanToIntegerTransformer transformer2 = new HumanToIntegerTransformer() {
            @Override
            public int transform(Human human) {
                return human.getSalary();
            }
        };
        System.out.println("transformer.transform2(john) = " + transformer2.transform(john));

        // Step 3 - Lambda
        // HumanToIntegerTransformer transformer3 = (Human human) -> human.getSalary(); // <- Ok
        // HumanToIntegerTransformer transformer3 = (human) -> human.getSalary(); // <- Ok
        HumanToIntegerTransformer transformer3 = human -> human.getSalary();
        System.out.println("transformer.transform3(john) = " + transformer3.transform(john));

        // Step 4 - Method reference
        HumanToIntegerTransformer transformer4 = Human::getSalary;
        System.out.println("transformer.transform4(john) = " + transformer4.transform(john));
    }
}
```

## Stream API

### Как можно получить Stream

Один из самых простых вариантов - использовать метод `stream()` из интерфейса `Collection`. Чаще всего это делают для списков `List`:

```java
List<String> names = Arrays.asList("John", "Bill");
Stream<String> nameStream = names.stream();
```

У класса `Stream` есть статический метод `of()`, который принимает массив или varargs параметры, и возвращает поток.

```java
Stream<Integer> intStream = Stream.of(1, 2, 5);
```

У созданого стрима есть:
1. Промежуточные/Вспомогательные методы
- `.filter(obj -> obj.num > 100)`
- `.map(obj -> obj.num * 2)`
- `.distinct()` *удаляет дубли элементов (сравнение идет методом `equals()` надо перегружать для своих класов)*
- `.sorted()` *сортирует поток элементов, которые реализуют интерфейс `Comparable`*
- `.limit(1)` *обрезает поток до указанного числа элементов*
- `.skip(3)` *пропускает указанное число элементов от начала потока*
2. Терминальные методы (завершают работу со стримом, возвращают результат
- `.collect(Collectors.toList())` *принимает интерфейс типа `Collector` позволяет собрать поток в `List`, `Set`, `Map`*
- `.count()` *узнать колличество елементов в стриме*
- `.min()` и `.max()` *поиск минимального и максимального. принимают на вход объект `Comparator`*
    - `.min((a, b) -> a - b)` - найти наибольшее из чисел:
- 