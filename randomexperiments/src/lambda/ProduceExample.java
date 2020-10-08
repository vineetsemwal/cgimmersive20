package lambda;

public class ProduceExample {

    public static void main(String args[]){
        IProduces produces=new IProduces() {
            @Override
            public String produce() {
                return "welcome to cg immersive training";
            }
        };
    }
}
