public class mercedez implements Media, Engine {
    public void play() {
        System.out.println("play music");
    }

    public void stop() {
        System.out.println("stop the music");
    }

    public int capacity(int n) {
        return n;
    }

    public static void main(String[] args) {
        mercedez m = new mercedez();
        int n = m.capacity(10);
        System.out.println(n);
        m.stop();
    }
}
