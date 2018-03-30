public class ShapeOval extends Shape {
    public ShapeOval(int typeCode, int startX, int startY, int endX, int endY) {
        super(typeCode, startX, startY, endX, endY);
    }

    @Override
    public int getTypeCode() {
        return Shape.TYPECODE_OVAL;
    }

    @Override
    public void draw() {
        drawOval();
    }

    private void drawOval() {
        System.out.println("drawOval: " + this.toString());
    }


}
