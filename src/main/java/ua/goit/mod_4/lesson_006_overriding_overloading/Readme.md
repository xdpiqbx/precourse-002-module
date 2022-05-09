## Method Overriding

If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.

### Rules for Java Method Overriding

- The method must have the same name as in the parent class;
- The method must have the same parameter as in the parent class;
- There must be an IS-A relationship (inheritance);
- Static method cannot be overridden

---

## Method Overloading

Multiple methods can have the `same name` with `different parameters`

```java
int myMethod(int x){}
float myMethod(float x){}
double myMethod(double x, double y){}
```

Multiple methods can have the same name as long as the number and/or type of parameters are different.