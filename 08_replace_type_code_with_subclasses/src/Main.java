public class Main {
    public static void main(String[] arg) {
        AbstractShape line = AbstractShape.createShape(ShapeFactory.LineFactory.getInstance(), 0, 0, 100, 200);
        AbstractShape rect = AbstractShape.createShape(ShapeFactory.RectangleFactory.getInstance(), 10, 20, 30, 40);
        AbstractShape oval = AbstractShape.createShape(ShapeFactory.OvalFactory.getInstance(), 100, 200, 300, 400);

        AbstractShape[] shape = {
            line, rect, oval
        };

        for (AbstractShape s: shape) {
            s.draw();
        }
    }
}
