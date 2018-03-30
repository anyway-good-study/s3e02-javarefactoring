public class ShapeRectangle extends Shape {
    public ShapeRectangle(int typeCode, int startX, int startY, int endX, int endY) {
        super(typeCode, startX, startY, endX, endY);
    }

    @Override
    public int getTypeCode() {
        return Shape.TYPECODE_RECTANGLE;
    }

    @Override
    public void draw() {
        drawRectangle();
    }

    private void drawRectangle() {
        System.out.println("drawRectangle: " + this.toString());
    }
}
