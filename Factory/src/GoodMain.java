public class GoodMain {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape(ShapeType.CIRCLE);
        shape.computeArea();
    }
}
