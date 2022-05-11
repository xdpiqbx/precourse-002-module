Exception hierarchy java

[List of Java Exceptions](https://programming.guide/java/list-of-java-exceptions.html)

## Package `java.lang`

- Throwable
  - Exception
    - CloneNotSupportedException
    - InterruptedException
    - ReflectiveOperationException
      - ClassNotFoundException
      - IllegalAccessException
      - InstantiationException
      - NoSuchFieldException
      - NoSuchMethodException
    - RuntimeException
      - ArithmeticException
      - ArrayStoreException
      - ClassCastException
      - EnumConstantNotPresentException
      - IllegalArgumentException
        - IllegalThreadStateException
        - NumberFormatException
      - IllegalCallerException
      - IllegalMonitorStateException
      - IllegalStateException
      - IndexOutOfBoundsException
        - ArrayIndexOutOfBoundsException
        - StringIndexOutOfBoundsException
      - LayerInstantiationException
      - NegativeArraySizeException
      - NullPointerException
      - SecurityException
      - TypeNotPresentException
      - UnsupportedOperationException
  - Error
    - AssertionError
    - LinkageError
      - BootstrapMethodError
      - ClassCircularityError
      - ClassFormatError
        - UnsupportedClassVersionError
      - ExceptionInInitializerError
      - IncompatibleClassChangeError
        - AbstractMethodError
        - IllegalAccessError
        - InstantiationError
        - NoSuchFieldError
        - NoSuchMethodError
      - NoClassDefFoundError
      - UnsatisfiedLinkError
      - VerifyError
    - ThreadDeath
    - VirtualMachineError
      - InternalError
      - OutOfMemoryError
      - StackOverflowError
      - UnknownError

---

## Package `java.io`

- IOError
- IOException
  - CharConversionException
  - EOFException
  - FileNotFoundException
  - InterruptedIOException
  - ObjectStreamException
    - InvalidClassException
    - InvalidObjectException
    - NotActiveException
    - NotSerializableException
    - OptionalDataException
    - StreamCorruptedException
    - WriteAbortedException
  - SyncFailedException
  - UTFDataFormatException
  - UnsupportedEncodingException
- UncheckedIOException

---

## Package `java.sql`

- SQLException
  - BatchUpdateException
  - SQLClientInfoException
  - SQLNonTransientException
    - SQLDataException
    - SQLFeatureNotSupportedException
    - SQLIntegrityConstraintViolationException
    - SQLInvalidAuthorizationSpecException
    - SQLNonTransientConnectionException
    - SQLSyntaxErrorException
  - SQLRecoverableException
  - SQLTransientException
    - SQLTimeoutException
    - SQLTransactionRollbackException
    - SQLTransientConnectionException
  - SQLWarning
    - DataTruncation