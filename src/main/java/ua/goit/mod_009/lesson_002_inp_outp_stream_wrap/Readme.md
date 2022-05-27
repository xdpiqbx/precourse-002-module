В основе всех классов, управляющих потоками байтов, находятся два абстрактных класса:
- `InputStream` (представляющий потоки ввода);
- `OutputStream` (представляющий потоки вывода).

Чтобы сделать работу с потоками более удобной, есть абстрактные классы:
- `Reader` (для чтения потоков символов);
- `Writer` (для записи потока символов).

Все остальные классы, работающие с потоками, являются наследниками этих абстрактных классов.

---

## InputStream
- ### FileInputStream
- ### BufferedInputStream
- ### ByteArrayInputStream
- ### FilterInputStream
- ### DataInputStream
- ### ObjectInputStream

## OutputStream
- ### FileOutputStream
- ### BufferedOutputStream
- ### ByteArrayOutputStream
- ### FilterOutputStream
- ### DataOutputStream
- ### ObjectOutputStream

---

## Reader
- ### FileReader
- ### BufferedReader
- ### CharArrayReader
- ### FilterReader

## Writer
- ### FileWriter
- ### BufferedWriter
- ### CharArrayWriter
- ### FilterWriter
