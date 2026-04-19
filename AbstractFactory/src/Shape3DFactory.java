public class Shape3DFactory implements ShapeFactory{
    @Override
    public Shape getShape(String shapeType) {
        return switch (shapeType) {
            case "Sphere" -> new Sphere();
            case "Cube" -> new Cube();
            default -> throw new IllegalArgumentException("Invalid shape type");
        };
    }
}
