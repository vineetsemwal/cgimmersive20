package lambda;

/**
 * bi consumer
 */
public class BiConsumerExample2 {

    public static void main(String args[]){
        IConcatTimes concatTimes=(str,times)->{
          String result="";
            for(int i=0;i<times;i++){
              result=result+str;
          }
            System.out.println(result);
        };

        concatTimes.concat("hello",3);

    }
}
