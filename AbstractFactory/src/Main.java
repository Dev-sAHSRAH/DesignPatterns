//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = FactoryProvider.getFactory("2D");
        Shape shape = factory.getShape("Square");
        System.out.println("Area of Square: " + shape.compute());

        factory = FactoryProvider.getFactory("3D");
        shape = factory.getShape("Cube");
        System.out.println("Area of Cube: " + shape.compute());
    }
}