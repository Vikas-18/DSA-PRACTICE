public class oopsconcept {
    public static class Box {
        protected int l; // Make the variables protected to allow access in the subclass
        protected int b;
        protected int h;

        void getl() {
            System.out.println(l);
        }

        void setl(int l) {
            this.l = l;
        }

        Box(int l, int b, int h) {
            this.l = l;
            this.b = b;
            this.h = h;
        }

        void print() {
            System.out.println("Hii I am in Box class");
        }
    }

    public static class BoxWeight extends Box {
        private int w;

        BoxWeight(int l, int b, int h, int w) {
            super(l, b, h);
            this.w = w;
        }

        @Override
        void print() {
            System.out.println("Hii I am in BoxWeight class");
        }
    }

    public static void main(String[] args) {
        BoxWeight box2 = new BoxWeight(4, 5, 6, 7);
        System.out.println(box2.h); // Now this will correctly print 6
    }
}
