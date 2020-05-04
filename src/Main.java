public class Main {
    public static void main(String[] args) throws InterruptedException {
        OddThread a = new OddThread();
        EvenThread b = new EvenThread();
        Thread aa = new Thread(a);
        Thread bb = new Thread(b);
        aa.start();
        bb.join(2000);
        bb.start();
    }
}
