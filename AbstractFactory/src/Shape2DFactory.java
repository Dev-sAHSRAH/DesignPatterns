public class Shape2DFactory implements ShapeFactory{
    @Override
    public Shape getShape(String shapeType) {
        return switch (shapeType) {
            case "Circle" -> new Circle();
            case "Square" -> new Square();
            default -> throw new IllegalArgumentException("Invalid shape type");
        };
    }
}
