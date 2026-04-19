# Abstract Factory Pattern – Quick Revision Notes

## 🧠 What it is

Creates **families of related objects** without specifying their concrete classes.

> **Factory of Factories** → gives you a factory based on category (e.g., 2D or 3D)

---

## 🏗️ Structure

* **Product Interface** → `Shape`
* **Concrete Products** → `Circle`, `Square`, `Sphere`, `Cube`
* **Abstract Factory** → `ShapeFactory`
* **Concrete Factories** → `Shape2DFactory`, `Shape3DFactory`
* **Factory Provider** → *factory of factories*

---

## 🔁 Flow

1. Ask **FactoryProvider** → “Give me 2D factory” *(factory of factories)*
2. Use factory → “Give me Circle”
3. Get object → use it

---

## ✅ When to Use

* Objects belong to **families/categories**
* Need to **avoid mixing incompatible objects**
* Want **scalable design**

---

## 👍 Pros

* Clean separation
* Easy to extend (new families)
* Avoids nested conditionals
* Ensures consistency within a family

---

## 👎 Cons

* More classes → added complexity
* Slight learning curve

---

## 🔥 Factory vs Abstract Factory

| Feature   | Factory       | Abstract Factory                 |
| --------- | ------------- | -------------------------------- |
| Focus     | Single object | Family of objects                |
| Core Idea | Create object | **Create factory → then object** |
| Example   | Get Circle    | Get 2D Factory → then Circle     |

---

## 🧠 One-line Intuition

* **Factory** → “Give me an object”
* **Abstract Factory** → “Give me a factory (factory of factories), then I’ll choose object”

---

## ⚡ Interview One-liner

> Abstract Factory is a **factory of factories** that helps create families of related objects without exposing their concrete implementations.
