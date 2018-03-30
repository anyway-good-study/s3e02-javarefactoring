public class Main {
    public static void main(String[] arg) {
        Shape line = Shape.createShape(Shape.TYPECODE_LINE, 0, 0, 100, 200);
        Shape rect = Shape.createShape(Shape.TYPECODE_RECTANGLE, 10, 20, 30, 40);
        Shape oval = Shape.createShape(Shape.TYPECODE_OVAL, 100, 200, 300, 400);

        Shape[] shape = {
            line, rect, oval
        };

        for (Shape s: shape) {
            s.draw();
        }
    }
}
