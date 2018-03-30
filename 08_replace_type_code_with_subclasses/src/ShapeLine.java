public class ShapeLine extends Shape {
    public ShapeLine(int typeCode, int startX, int startY, int endX, int endY) {
        super(typeCode, startX, startY, endX, endY);
    }

    @Override
    public int getTypeCode() {
        return Shape.TYPECODE_LINE;
    }

    @Override
    public void draw() {
        drawLine();
    }

    private void drawLine() {
        System.out.println("drawLine: " + this.toString());
    }

}
