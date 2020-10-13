package enumexamples;

public class MySingleton {

    private static MySingleton object=new MySingleton();

    public static MySingleton getInstance(){
        return object;
    }
    private MySingleton(){

    }
}
