Alt + Insert (to generate getters and setters)

---

## Accessibility

`private` - in class and siblings

`default` - in class, inheritors in package and package (package private)

`protected` - in class, all inheritors and package

`public` - anywhere

---

## Static

Variables and Methods exist independently of any instances created for the class.

Static variables and methods can be accessed using the class name followed by a dot and the name of the variable or method.

Static method can not be abstract.

---

## Abstract

`Abstract class`: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

`Abstract method`: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

---

## Final

Classes marked as final can’t be extended

Methods marked as final cannot be overridden

Variables marked as final can't be reassigned. Once a final variable is initialized, it can’t be altered (constant)

Final method can not be abstract.

---

## Native

This is a non-access modifier that is used to access methods implemented in a language other than Java like C/C++.

A native method is a Java method (either an instance method or a class method) whose implementation is also written in another programming language such as C/C++.

`[ public | protected | private] native [return_type] method ();`

---

## Synchronized

A piece of logic marked with synchronized becomes a synchronized block, allowing only one thread to execute at any given time.

---

## Ways out of the methods

- End of instructions in method (`void`);
- `return`;
- `throw new Exception()`;
- `System.exit()` Terminates the currently running Java Virtual Machine