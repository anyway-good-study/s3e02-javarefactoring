public abstract class ShapeFactory {
    public abstract Shape create(int startX, int startY, int endX, int endY);

    public static class LineFactory extends ShapeFactory {
        private static final ShapeFactory factory = new LineFactory();

        public static ShapeFactory getInstance() {
            return factory;
        }

        @Override
        public Shape create(int startX, int startY, int endX, int endY) {
            return new ShapeLine(startX, startY, endX, endY);
        }
    }

    public static class RectangleFactory extends ShapeFactory {
        private static final ShapeFactory factory = new RectangleFactory();

        public static ShapeFactory getInstance() {
            return factory;
        }

        @Override
        public Shape create(int startX, int startY, int endX, int endY) {
            return new ShapeRectangle(startX, startY, endX, endY);
        }
    }

    public static class OvalFactory extends ShapeFactory {
        private static final ShapeFactory factory = new OvalFactory();

        public static ShapeFactory getInstance() {
            return factory;
        }

        @Override
        public Shape create(int startX, int startY, int endX, int endY) {
            return new ShapeOval(startX, startY, endX, endY);
        }
    }
}
