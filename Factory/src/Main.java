public class Main {
    public static void main(String[] args) {

        String type = "CIRCLE";

        Shape shape;

        if (type.equals("CIRCLE")) {
            shape = new Circle();
        } else if (type.equals("SQUARE")) {
            shape = new Square();
        } else if (type.equals("RECTANGLE")) {
            shape = new Rectangle();
        } else {
            throw new IllegalArgumentException("Invalid type");
        }

        shape.computeArea();
    }

/*
    ❌ What’s wrong here?
    Client knows all concrete classes
    Violates Open/Closed Principle
    Adding new shape = modify client 😬
    Hard to maintain & scale
    ✅ Good Example (Factory Pattern)
    👉 Move object creation logic to a Factory class
 */
}
