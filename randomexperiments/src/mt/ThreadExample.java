package mt;

public class ThreadExample {

    public static void main(String[] args) {
        try {
            ChildThread child = new ChildThread("child 1");
            child.start();
            for (int i = 0; i < 5; i++) {
                System.out.println("main thread i=" + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
