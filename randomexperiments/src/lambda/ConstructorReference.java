package lambda;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReference {

    public static void main(String []args){
     Supplier<Manager>supplier=Manager::new;
     Manager manager1=supplier.get();
     System.out.println("manager1 "+manager1.getName()+" "+manager1.getAge());
     Function<String,Manager>function=Manager::new;
     Manager manager2=function.apply("shivam");
     System.out.println("manager2 "+ manager2.getName()+" "+manager2.getAge());
     BiFunction<String,Integer,Manager>biFunction=Manager::new;
     Manager manager3=biFunction.apply("avichal",21);
     System.out.println("manager3 "+ manager3.getName()+" "+manager3.getAge());

     Supplier<ArrayList>listSupplier= ArrayList::new;
     ArrayList<Integer>list= listSupplier.get();
     System.out.println("list size="+list.size());
     Supplier<HashSet>setSupplier=HashSet::new;
     HashSet<Integer>set=setSupplier.get();
     System.out.println("set size="+set.size());
    }
}
