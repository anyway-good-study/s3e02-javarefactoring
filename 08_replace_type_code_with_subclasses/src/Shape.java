public abstract class Shape {
    public static final int TYPECODE_LINE = 0;
    public static final int TYPECODE_RECTANGLE = 1;
    public static final int TYPECODE_OVAL = 2;

    private final int startX;
    private final int startY;
    private final int endX;
    private final int endY;

    public Shape(int startX, int startY, int endX, int endY) {
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

    public static Shape createShape(int typeCode, int startX, int startY, int endX, int endY) {
        switch(typeCode) {
            case TYPECODE_LINE:
                return new ShapeLine(typeCode, startX, startY, endX, endY);
            case TYPECODE_RECTANGLE:
                return new ShapeRectangle(typeCode, startX, startY, endX, endY);
            case TYPECODE_OVAL:
                return new ShapeOval(typeCode, startX, startY, endX, endY);
            default:
                throw new IllegalArgumentException("typecode = " + typeCode);
        }
    }
}