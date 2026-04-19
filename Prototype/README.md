# Java `Cloneable` & Prototype Pattern – Quick Revision Notes

---

## 🧠 What is `Cloneable`?

* `Cloneable` is a **marker interface** (no methods)
* It tells JVM: **“This object can be cloned”**

```java
public interface Cloneable {}
```

---

## 🎯 Key Idea

* Cloning is done via:

  ```java
  Object.clone()
  ```
* If a class **does NOT implement `Cloneable`** → calling `clone()` throws:

  ```
  CloneNotSupportedException
  ```

---

## ✅ Basic Example

```java
class DBConnection implements Cloneable {

    String url;

    DBConnection(String url) {
        this.url = url;
    }

    @Override
    public DBConnection clone() {
        try {
            return (DBConnection) super.clone(); // shallow copy
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
```

---

## 🧪 Usage

```java
DBConnection obj1 = new DBConnection("db-url");
DBConnection obj2 = obj1.clone();
```

---

## ⚠️ Important Concepts

### 🔹 Marker Interface

* Empty interface
* Used as a **flag for JVM behavior**

---

### 🔹 Shallow Copy (default clone behavior)

* Copies **field values**
* References are **shared**

```java
class A {
    List<String> data;
}
```

👉 After cloning → both objects share same list 😬

---

### 🔹 Deep Copy

* Copies **actual objects**
* No shared references

---

## ❌ Problems with `Cloneable`

* No methods → confusing design
* `clone()` is **protected in Object**
* Requires casting
* Needs exception handling
* Default cloning is **shallow (bug-prone)**

👉 Many developers consider it **bad design**

---

## ✅ Modern Alternative (Preferred)

Use manual copy:

```java
public DBConnection copy() {
    return new DBConnection(this.url);
}
```

Or optimized copy (Prototype style):

```java
private DBConnection() {}

public DBConnection copy() {
    DBConnection copy = new DBConnection(); // no expensive setup
    copy.url = this.url;
    return copy;
}
```

---

# 🧠 Prototype Pattern Recap

## 🎯 Definition

> Create new objects by **copying existing ones** instead of creating from scratch.

---

## ✅ When to Use

* Object creation is **expensive**
* Need many **similar objects**
* Want to reuse **pre-initialized state**

---

## ❌ When NOT to Use

* Object is simple
* Copy logic becomes complex

---

## 🔥 Correct Prototype Example

```java
class DBConnection {

    private String url;

    public DBConnection(String url) {
        System.out.println("Expensive setup...");
        this.url = url;
    }

    private DBConnection() {}

    public DBConnection copy() {
        DBConnection copy = new DBConnection(); // no expensive call
        copy.url = this.url;
        return copy;
    }
}
```

---

## 🧠 Key Insight

> Prototype is NOT about `clone()`
> It is about **avoiding expensive initialization**

---

## ⚡ One-liners (Interview Ready)

* **Cloneable** → “Marker interface that allows object cloning”
* **clone()** → “Creates a shallow copy using Object.clone()”
* **Prototype** → “Copy objects instead of recreating them”

---

## 🚀 Final Intuition

* `Cloneable` = Permission
* `clone()` = Mechanism
* Prototype = Design idea

👉 **“Copy, don’t recreate.”**
