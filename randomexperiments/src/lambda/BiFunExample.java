package lambda;

public class BiFunExample {
    public static void main(String args[]){
        IConcatTimesFun fun=(str,times)->{
            String result="";
            for (int i=0;i<5;i++){
                result=result+str;
            }
            return result;
        };
       String result= fun.concat("hello",5);
       System.out.println(result);
    }
}
