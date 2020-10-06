package mt;

public class BracketRunnable implements Runnable{
    private BracketAdder bracketAdder;
    public BracketRunnable(BracketAdder adder){
        this.bracketAdder=adder;
    }

    @Override
    public void run() {
      for (int i=0;i<3;i++) {
          bracketAdder.add();
      }
    }
}
