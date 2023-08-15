public class Overiding {
    public static void main(String[] args) {

        Square sq = new Square();
        sq.area();

    }

    public static class Shapes {
        public void area() {
            System.out.println("shapes area");
        }
    }

    public static class Square extends Shapes {

        @Override
        public void area() {
            System.out.println("square area");
        }
    }
}
