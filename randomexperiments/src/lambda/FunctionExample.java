package lambda;

public class FunctionExample {
    public static void main(String args[]){
        ILength expression=str->str.length();//lambda expression

        ILength block=str->{
            int len=str.length();
            return len;
        };

        int len1=expression.length("hello");
        int len2=block.length("capgemini");
        System.out.println("expression calcualted length="+len1);
        System.out.println("block calcualted length="+len2);
    }
}
