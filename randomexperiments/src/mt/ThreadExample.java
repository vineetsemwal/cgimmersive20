package mt;

public class ThreadExample {

    public static void main(String[] args) {
        try {
            ExtendThreadChild child1 = new ExtendThreadChild("extend thread child 1");
            ExtendThreadChild child2 = new ExtendThreadChild("extend thread child 2");
            ImplementRunnableChild runnable1=new ImplementRunnableChild("implement runnable child1");
            ImplementRunnableChild runnable2=new ImplementRunnableChild("implement runnable child2");
            Thread child3=new Thread(runnable1);
            Thread child4=new Thread(runnable2);
            child1.start();
            child2.start();
            child3.start();
            child4.start();
            for (int i = 0; i < 5; i++) {
                System.out.println("main thread i=" + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
