package mt;

public class ChildThread extends Thread{

    public ChildThread(String threadName){
        super(threadName);
    }

    @Override
    public void  run(){
        try {
            for (int i = 0; i < 5; i++) {
                String name = getName();
                System.out.println(name + " i=" + i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
