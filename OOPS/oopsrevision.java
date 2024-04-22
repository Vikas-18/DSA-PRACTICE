public class oopsrevision {
    public static void main(String[] args) {
        Shapes st1 = new Shapes("Triangle", 19);
        Circle c1 = new Circle(15, "circle");

        System.out.println(c1.perimeter);
    }

    public static class Shapes {
        int area;
        int perimeter = 18;
        String name;

        public Shapes() {

        }

        public Shapes(String name) {
            this.name = name;

        }

        public Shapes(String name, int area) {
            this.name = name;
            this.area = area;
        }

        public Shapes(int area) {

            this.area = area;
        }
    }

    public static class Circle extends Shapes {
        double pi = 3.14;
        String name;

        public Circle(int area) {
            super(area);
        }

        public Circle(int area, String name) {
            super(area);
            this.name = name;
        }

    }
}
