# Polymorphism

```java
public class Polymorphism {
    public static void main(String[] args) {
        Database db = new PostgreSQL(); // Polymorphism !
        db.connection();
        db.select();
    }
}
```

```java
public class Database {
    public void connection(){
        System.out.println("Connected!");
    }
    public void select(){
        System.out.println("Select * FROM DB");
    }
}
```

```java
public class PostgreSQL extends Database {
    public void connection(){
        System.out.println("Connected to PostgreSQL!");
    }
    public void select(){
        System.out.println("Select * FROM PostgreSQL");
    }
}
```

```java
public class OracleSQL extends Database {
    public void connection(){
        System.out.println("Connected to OracleSQL!");
    }
    public void select(){
        System.out.println("Select * FROM OracleSQL");
    }
}
```

```java
public class MySQL extends Database {
    public void connection(){
        System.out.println("Connected to MySQL!");
    }
    public void select(){
        System.out.println("Select * FROM MySQL");
    }
}
```