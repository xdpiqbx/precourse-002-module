`Ctrl + Alt + m` - To make method from part of code

## if ... else ...

```java
if(iAge >= 18){
    System.out.println("Is adult");
}else if(iAge >= 14){
    System.out.println("Is NOT adult");
}else{
    System.out.println("Too small");
}
```

## ? ... : ...

```java
System.out.println(
    getRandomInt() > 15 ? getRandomInt() : "Some other"
);
```

## switch

```java
switch(iSomeNum){
    case 1:
        System.out.println("One");
        break;
    case 2:
        System.out.println("Two");
        break;
    case 3:
        System.out.println("Three");
        break;
    default:
        System.out.println("Other");
}
```