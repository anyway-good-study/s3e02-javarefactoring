public class Main {
    public static void main(String[] arg) {
        Shape line = new Shape(Shape.TYPECODE_LINE, 0, 0, 100, 200);
        Shape rect = new Shape(Shape.TYPECODE_RECTANGLE, 10, 20, 30, 40);
        Shape oval = new Shape(Shape.TYPECODE_OVAL, 100, 200, 300, 400);

        Shape[] shape = {
            line, rect, oval
        };

        for (Shape s: shape) {
            s.draw();
        }
    }
}
