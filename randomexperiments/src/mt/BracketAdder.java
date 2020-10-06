package mt;

public class BracketAdder {

    void add(){
        try {
            System.out.print("(");
            System.out.print("hello");
            Thread.sleep(1000);
            System.out.print(")");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
