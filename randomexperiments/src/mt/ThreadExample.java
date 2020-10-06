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
                Thread.sleep(10);
            }
            System.out.println("*****checking before join");
            System.out.println("child 1 alive="+child1.isAlive());
            System.out.println("child 2 alive="+child2.isAlive());
            System.out.println("child 3 alive="+child3.isAlive());
            System.out.println("child 4 alive="+child4.isAlive());
            child1.join();
            child2.join();
            child3.join();
            child4.join();
            System.out.println("*****checking after join");
            System.out.println("child 1 alive="+child1.isAlive());
            System.out.println("child 2 alive="+child2.isAlive());
            System.out.println("child 3 alive="+child3.isAlive());
            System.out.println("child 4 alive="+child4.isAlive());
            System.out.println("***finishing main thread");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
