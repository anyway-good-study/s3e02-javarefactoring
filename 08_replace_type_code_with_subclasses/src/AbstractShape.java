public abstract class AbstractShape {
    public static final int TYPECODE_LINE = 0;
    public static final int TYPECODE_RECTANGLE = 1;
    public static final int TYPECODE_OVAL = 2;

    private final int startX;
    private final int startY;
    private final int endX;
    private final int endY;

    public AbstractShape(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public abstract int getTypeCode();

    public abstract String getName();

    public abstract void draw();


    public String toString() {
        return "[" + getName() + ", " + "("+ startX + ", " + startY + ")-" + "("+ endX + ", " + endY + ")]";
    }

    public static AbstractShape createShape(ShapeFactory factory, int startX, int startY, int endX, int endY) {
        return factory.create(startX, startY, endX, endY);
    }
}