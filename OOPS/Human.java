public class Human extends Species {

    public static void main(String[] args) {
        Human h1 = new Human(false, 2);
        System.err.println(h1.legs);
    }

    boolean isMale;

    public Human() {

    }

    public Human(boolean isMale) {

        this.isMale = isMale;
    }

    public Human(boolean isMale, int legs) {
        super(legs);
        this.isMale = isMale;

    }

}
