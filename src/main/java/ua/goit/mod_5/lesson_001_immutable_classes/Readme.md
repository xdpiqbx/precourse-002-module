## Immutable
- String
> each change to an instance of a class results in the creation of a new object.

## Mutable
> each change to an instance of a class does NOT result in the creation of a new object.
- `StringBuilder` - contains unsynchronized methods (not for multi thread, be careful can beat dirty reading)
- `StringBuffer` - contains synchronized methods