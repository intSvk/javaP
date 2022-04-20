package Threading;

public class TestThread {
    public static void main(String[] args) {
        for (int j = 0; j < 5; j++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                System.out.println(e);
            }
            System.out.println(j);
        }
    }
}
