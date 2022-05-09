Java Inheritance rules:
- 1 time inherit;
- private properties and methods is not inheritable;

```java
public class Animal {
    public void eat(){
        System.out.println("Animal eating ...");
    }
}
```

```java
public class Cat extends Animal{
    public void eat(){
        super.eat();
        System.out.println("Cat eating ...");
    }
}
```

## Final

### Imposible inheritance (it will call error)

```java
public final class Animal {
    public void eat(){
        System.out.println("Animal eating ...");
    }
}
```