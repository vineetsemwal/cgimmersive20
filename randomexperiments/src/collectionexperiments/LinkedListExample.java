package collectionexperiments;

import java.util.LinkedList;
import java.util.List;

/*
  LinkedList can be used as a concrete implementation of List
  But it can also be used as a concrete implementation of Deque
 */
public class LinkedListExample {

    public static void main(String args[]) {

        LinkedListExample example = new LinkedListExample();
        example.execute();

    }

    public void execute() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(20);
        list.add(30);
        list.addFirst(10);//specification in Deque so implementation in List is there
        System.out.println("after adding elements");
        display(list);

        //fetches first element but does NOT remove it
        //specification in Deque, implementation in LinkedList
        Integer firstElement=list.peek();
        System.out.println("first element from peek is "+firstElement);
        display(list);

        firstElement=list.poll();
        System.out.println("first element from poll is "+firstElement);
        display(list);

        System.out.println("after using offer");
        //add element at the end which add(e) does too
        list.offer(40);
        //adds element at the start, same as addFirst(e)
         list.offerFirst(50);

         display(list);

    }

    public void display(List<Integer> list) {
        for (Integer e : list) {
            System.out.println(e);
        }

    }

}
