package mt;

public class SynchronizationExample {

    public static void main(String args[]){

        BracketAdder bracketAdder=new BracketAdder();//resource
        try {
            BracketRunnable runnable1 = new BracketRunnable(bracketAdder);
            Thread thread1 = new Thread(runnable1);
            BracketRunnable runnable2 = new BracketRunnable(bracketAdder);
            Thread thread2=new Thread(runnable2);
            BracketRunnable runnable3 = new BracketRunnable(bracketAdder);
            Thread thread3=new Thread(runnable3);
            thread1.start();
            thread2.start();
            thread3.start();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
