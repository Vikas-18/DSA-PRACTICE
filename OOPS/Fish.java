public class Fish extends Human {
    public static void main(String[] args) {
        Fish f = new Fish(20, true, 0);
        System.out.println(f.legs);
    }

    public Fish() {

    }

    int spikes = 0;

    public Fish(int spikes, boolean isMale, int legs) {
        super(isMale, legs);
        this.spikes = spikes;
    }
}
