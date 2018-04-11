
class ShapeLine extends Shape {
    public ShapeLine(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }

    @Override
    public String getName() {
        return "LINE";
    }

    @Override
    public void draw() {
        System.out.println("drawLine: " + this.toString());
    }
}

class ShapeRectangle extends Shape {
    public ShapeRectangle(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }

    @Override
    public String getName() {
        return "RECTANGLE";
    }

    @Override
    public void draw() {
        System.out.println("drawRectangle: " + this.toString());
    }
}

class ShapeOval extends Shape {
    public ShapeOval(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }

    @Override
    public String getName() {
        return "OVAL";
    }

    @Override
    public void draw() {
        System.out.println("drawOval: " + this.toString());
    }
}

abstract class Shape {
    private final int sx;
    private final int sy;
    private final int ex;
    private final int ey;

    public static Shape createLine(int startx, int starty, int endx, int endy) {
        return new ShapeLine(startx, starty, endx, endy);
    }

    public static Shape createRectangle(int startx, int starty, int endx, int endy) {
        return new ShapeRectangle(startx, starty, endx, endy);
    }

    public static Shape createOval(int startx, int starty, int endx, int endy) {
        return new ShapeOval(startx, starty, endx, endy);
    }

    protected Shape(int sx, int sy, int ex, int ey) {
        this.sx = sy;
        this.sy = sy;
        this.ex = ex;
        this.ey = ey;
    }

    public abstract String getName();

    public String toString() {
        return "[ "
                + getName() + ", "
                + "(" + this.sx + ", " + this.sy + ")-"
                + "(" + this.ex + ", " + this.ey + ") ]";
    }

    public abstract void draw();
}

public class StudyJava {
    public static void main(String[] args) {
        Shape line = Shape.createLine(0,0, 10, 10);
        Shape rectangle = Shape.createRectangle(10,20,30,40);
        Shape oval = Shape.createOval(100,200,300,400);

        Shape[] shape = {
                line,
                rectangle,
                oval,
        };

        for (Shape s : shape) {
            s.draw();
        }
    }
}
