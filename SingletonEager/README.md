# Singleton Pattern – Eager Initialization (Quick Summary)

## ✅ What it is

Eager initialization creates the singleton instance **at class loading time**.

```java
public class DBConnection {
    private static final DBConnection instance = new DBConnection();

    private DBConnection() {}

    public static DBConnection getInstance() {
        return instance;
    }
}
```

---

## 👍 Pros

* Thread-safe by default (handled by JVM class loading)
* Simple implementation
* No synchronization overhead
* Always ready to use

---

## 👎 Cons

* Object created even if never used (wastes memory)
* Slower application startup
* No lazy loading (no control over creation timing)
* Hard to handle initialization exceptions
* Not flexible for runtime configs / dependencies
* Difficult to mock in tests

---

## ⚠️ Important Notes

* Cannot fail due to multithreading
* Can still be broken using:

    * Reflection
    * Serialization
    * Cloning

---

## 🧠 When to Use

Use eager singleton when:

* Object is lightweight
* Always required
* No external dependencies (DB, network, configs)

---

## 🚫 When NOT to Use

Avoid eager singleton when:

* Object creation is expensive
* Depends on runtime values or services
* You want better control over initialization

---

## 🔥 One-line Intuition

**Eager = Create now, maybe use later**
**Lazy = Create only when needed**
