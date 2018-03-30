public class Main {
    public static void main(String[] arg) {
        Shape line = Shape.createShape(ShapeFactory.LineFactory.getInstance(), 0, 0, 100, 200);
        Shape rect = Shape.createShape(ShapeFactory.RectangleFactory.getInstance(), 10, 20, 30, 40);
        Shape oval = Shape.createShape(ShapeFactory.OvalFactory.getInstance(), 100, 200, 300, 400);

        Shape[] shape = {
            line, rect, oval
        };

        for (Shape s: shape) {
            s.draw();
        }
    }
}
