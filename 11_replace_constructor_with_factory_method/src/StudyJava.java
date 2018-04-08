
class Shape {
    public static final int TYPECODE_LINE = 0;
    public static final int TYPECODE_RECTANGLE = 1;
    public static final int TYPECODE_OVAL = 2;

    private final int typecode;
    private final int sx;
    private final int sy;
    private final int ex;
    private final int ey;

    public Shape(int typecode, int sx, int sy, int ex, int ey) {
        this.typecode = typecode;
        this.sx = sy;
        this.sy = sy;
        this.ex = ex;
        this.ey = ey;
    }

    public int getTypecode() {
        return this.typecode;
    }

    public String getName() {
        switch (this.typecode) {
            case TYPECODE_LINE:
                return "LINE";
            case TYPECODE_RECTANGLE:
                return "RECTANGLE";
            case TYPECODE_OVAL:
                return "OVAL";
            default:
                return null;
        }
    }

    public String toString() {
        return "[ "
                + getName() + ", "
                + "(" + this.sx + ", " + this.sy + ")-"
                + "(" + this.ex + ", " + this.ey + ") ]";
    }

    public void draw() {
        switch (this.typecode) {
            case TYPECODE_LINE:
                drawLine();
                break;
            case TYPECODE_RECTANGLE:
                drawRectangle();
                break;
            case TYPECODE_OVAL:
                drawOval();
                break;
            default:
                ;
        }
    }

    private void drawLine() {
        System.out.println("drawLine: " + this.toString());
    }

    private void drawRectangle() {
        System.out.println("drawRectangle: " + this.toString());
    }

    private void drawOval() {
        System.out.println("drawOval: " + this.toString());
    }
}

public class StudyJava {
    public static void main(String[] args) {
        Shape line = new Shape(Shape.TYPECODE_LINE, 0,0, 10, 10);
        Shape rectangle = new Shape(Shape.TYPECODE_RECTANGLE, 10,20,30,40);
        Shape oval = new Shape(Shape.TYPECODE_OVAL, 100,200,300,400);

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
