public class FactoryProvider {
    public static ShapeFactory getFactory(String dimension){
        return switch (dimension) {
            case "2D" -> new Shape2DFactory();
            case "3D" -> new Shape3DFactory();
            default -> throw new IllegalArgumentException("Invalid dimension");
        };
    }
}
