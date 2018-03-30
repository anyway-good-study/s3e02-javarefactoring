public class ShapeRectangle extends AbstractShape {
    public ShapeRectangle(int startX, int startY, int endX, int endY) {
        super(startX, startY, endX, endY);
    }

    @Override
    public int getTypeCode() {
        return AbstractShape.TYPECODE_RECTANGLE;
    }

    @Override
    public String getName() {
        return "RECTANGLE";
    }

    @Override
    public void draw() {
        drawRectangle();
    }

    private void drawRectangle() {
        System.out.println("drawRectangle: " + this.toString());
    }
}
